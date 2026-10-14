package Assignment2;

public class CircularQueue {
   static class Node{
	   int data;
	   Node next;
	   Node(int data){
		   this.data=data;
		   next=null;
		  
	   }
   }
   Node head,tail;
   int size=0;
    public CircularQueue() {
      head=null;
 
    }
    
    public void addFirst(int data){
    	Node newnode=new Node(data);
    	if(head==null)
    		head=tail=newnode;
    	else {
    		newnode.next=head;
    		tail.next=newnode;
    		head=newnode;
    		size++;
    	}
    		
    	   
    }
    
    public void addLast(int data) {
    	Node newnode=new Node(data);
    	if(head==null)
    		head=tail=newnode;
    	else {
    		tail.next=newnode;
    		newnode.next=head;
    		tail=newnode;
    		size++;
    	}
   
    }
    
    public void display() {
    	if(head==null)
    		return;
    	else {
    		Node trav=head;
    		do {
    			System.out.println(" "+trav.data);
    			trav=trav.next;
    		}while(trav!=head);
    	}
    }
    
}

