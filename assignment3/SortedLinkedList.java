package assignment3;

import assignment3.LinkedList.Node;

public class SortedLinkedList {
	static class Node{
		  int data;
		  Node next;
		  Node(int data){
			  this.data=data;
			  next=null;
		  }
	  }
	  Node head;
	  SortedLinkedList(){
		  head=null;
	  }
	  public void addLast(int data) {
		  Node newnode=new Node(data);
		  if(head==null) {
			  head=newnode;
		  }else {
			  Node trav=head;
			  while(trav.next!=null) {
				  trav=trav.next;
			  }
			  trav.next=newnode;
		  }
	  }
	  //create node 
	  //than make trav and iterate till trav.data=value
	  //than create links 
	  public void afterData(int data,int value){
		  Node newnode=new Node(data);
		  if(head==null) {
			  head=newnode;
		  }else {
		  Node trav=head;
		  while(trav.data!=value) {
			  trav=trav.next;
		  }
		  newnode.next=trav.next;
		  trav.next=newnode;
	  }
		  }
	  public void beforeData(int data,int value) {
		  Node newnode=new Node(data);
		 Node trav=head;
		  if(head==null) {
			  head=newnode;
		  }else {
			  trav=head;
			  while(trav.next!=null&&trav.next.data!=value) {
				  trav=trav.next;
			  }
			  if(head.data==value) {
				  newnode.next=head;
				  head=newnode;
			  }else {
			  newnode.next=trav.next;
			  trav.next=newnode;
		  }
			  }
		  
	  }
	  public void addSortedOrder(int data) {
		  Node newnode=new Node(data);
		int minimum=0;
		  if(head==null) {
			  head=newnode;
			  minimum=newnode.data;
		  }else {
			  
		       //minimum=head.data;
			  if(minimum<data) {
				  afterData(data,minimum);
			  }else {
				  beforeData(data, minimum);
				  minimum=data;
			  }
			   
			  
		  }
	  }
	  public void display() {
		   if(head==null) {
			   return;
		   }else {
			   Node trav=head;
			   do{
				  System.out.println(" "+trav.data);
				  trav=trav.next; 
			   } while(trav.next!=null); 
			   }   
			   
		   }
}
