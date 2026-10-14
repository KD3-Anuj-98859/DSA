package assignment3;

public class CircularLinkedList {
    class Node{
    	int data;
    	Node next;
    	public Node(int data){
    		next=null;
    		this.data=data;
    	}
    }
    Node head;
    Node tail;
    public CircularLinkedList() {
    	head=null;
    	tail=null;	
    }
    public void addLast(int value) {
    	Node node=new Node(value);
    	if(head==null) {
    	head=node;
    	tail=node;
    	}else {
    		node.next=head;
    		tail.next=node;
    		tail=node;
    	}
    }
    public void addPosition(int value,int position) {
    	Node newnode=new Node(value);
    	if(head==null) {
    		head=newnode;
    	    tail=newnode;
    	}else if (position<=1) {
    		
    	}else{
             Node trav=head;
             for(int i=1;i<position-1;i++) {
            	 trav=trav.next;
             }
             newnode.next=trav.next;
             trav.next=newnode;
    	}
    }
    public void deletePosition(int position) {
    	if(head==null)
    		return;
    	else {
    		Node trav=head;
    		for(int i=0;i<position-1;i++){
    			trav=trav.next;
    		}
    		trav.next=trav.next.next;
    	}
    	
    	
    	
    	
    }
    public void display() {
    	if(head==null) {
    		return;
    	}
    	Node trav=head;
    	do {
    	
    		System.out.println(""+trav.data);
    		trav=trav.next;
    	}
    	while(trav!=head); 
    		
    	
    }
}
