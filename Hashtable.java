import java.util.ArrayList;

public class Hashtable {
	
	private ArrayList<Node> arrayList;
	private int listSize;
	
	public Hashtable() {
        arrayList = new ArrayList<>();
        listSize = 0;
 
        for (int i = 0; i < 314527; i++) {
            arrayList.add(null);
        }
    }

	public int getIndex(String key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % 314527;
        return index;
	 }

	public boolean containsKey (String key) {
		int index = getIndex(key);
        Node head = arrayList.get(index);

		 while (head != null) {
            if (head.getKey().equals(key)) {
                return true;
            }
            head = head.getNext();
	     }
	 
	     return false;
	}
	
	
	public String get(String key) {
		int index = getIndex(key);
        Node head = arrayList.get(index);

        while (head != null) {
            if (head.getKey().equals(key)) {
                return head.getValue();
            }
            head = head.getNext();
	     }
	 
	    return null;
	}
	
	public void put(String key, String value) {
		int index = getIndex(key);
        Node head = arrayList.get(index);
 
        while (head != null)
        {
            if (head.getKey().equals(key))
            {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
 
        listSize++;
        head = arrayList.get(index);
        Node newNode = new Node(key, value);
        newNode.setNext(head);
        arrayList.set(index, newNode);

	}
	
	public String remove(String key) {
		int index = getIndex(key);
	 
        Node head = arrayList.get(index);
 
        Node prev = null;
        while (head != null)
        {
            if (head.getKey().equals(key)) {
                break;
            }
            
            prev = head;
            head = head.getNext();
        }
 
        if (head == null) {
            return null;
        }
        
        listSize--;
 
        if (prev != null) {
            prev.setNext(head.getNext());
        } else {
            arrayList.set(index, head.getNext());
        }
        
        return head.getValue();

	}
}
