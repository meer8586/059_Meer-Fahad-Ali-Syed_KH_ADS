import java.util.*;
class ReverseLinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static void display(int elements[], int count, int test){
		System.out.println(test);
		System.out.println(count);
		for(int i=0; i<elements.length; i++){
			System.out.println(elements[i]);
		}
	}
	
	static Node insert(Node head, int data){
		Node n = new Node(data);
		n.next = head;
		return n;
	}
	
	static Node reverse(Node head){
		return reverseNode(head, head);
	}
	
	static Node reverseNode(Node head, Node n){
		Node first, last;
		if(head == null)
			return n;
		first = head;
		last = first.next;
		
		if(last == null){
			n = first;
			return n;
		}
		
		n = reverseNode(last, n);
		
		last.next = first;
		first.next = null;
		return n;
	}
	
	static void display(Node head){
		Node current = head;
		while(current != null){
			System.out.print(current.data+"--> ");
			current = current.next;
		}
		System.out.println("Null");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test = 1;
		Node head = null;
		
		int elements[] = {1,2,3,4,5};
		int count = elements.length;
		display(elements, count, test);
		for(int i=0; i<elements.length; i++){
			head = insert(head, elements[i]);
		}
		display(elements , count , test); 
		head = reverse(head);
		display(head);
	}
}