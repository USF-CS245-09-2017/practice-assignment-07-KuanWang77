
public class Node {
	private Node next;
	private String value;
	private String key;
	
	public Node(String key, String value) {
		this.next = null;
		this.value = value;
		this.key = key;
	}
	
	public Node() {
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String s) {
		this.value = s;
	}
}
