package Assignment2;

public class LinearQueue {
    int arr[]=new int[10];
	int rear=0;
    int front=0;
    int size=0;
  public void offer(int value) {
	  if(isFull()) {
		  System.out.println("Queue is Full:");
	  }
	  arr[rear]=value;
	  rear++;
	  size++;
  }
  public  int pop() {
    	int value=arr[front++];
    	size--;
    	return value;
   }
   public int  peek() {
	   if(isEmpty()) {
		   return -1;
	   }
	   return arr[front];
   }
   public boolean isEmpty() {
	   return size==0;
		   
   }
   public boolean isFull() {
	   return size==10;
   }
    
    
}
