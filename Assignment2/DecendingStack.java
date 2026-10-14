package Assignment2;

public class DecendingStack {
   
	 int size;
	 int top;
    public DecendingStack (int size) {
    	this.size=size;
    	top=size;
    }
   
    int arr[]=new int[10];
    public void push(int data) {
          //System.out.println("size : "+size);
    	if(isFull()) {
    	//	System.out.println(arr.length);
    		System.out.println("Stack is full: ");
    	}else {
    	arr[--top]=data;
        }
    	}
    public int pop() {
    	if(isEmpty()) {
    		return -1;
    	}else {
            return arr[top++];
         }
    }
    public int peek() {
    	if(isEmpty())
    		return -1;
    	return arr[top];
    }
    public boolean isEmpty() {
    	return top==size;
    }
    public boolean isFull() {
         return top==0;
    }
}
