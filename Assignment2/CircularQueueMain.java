package Assignment2;

public class CircularQueueMain {
    public static void main(String[] args) {
    	CircularQueue cq=new CircularQueue();
    	cq.addFirst(10);
    	cq.addFirst(20);
    	cq.addFirst(30);
    	cq.addLast(40);
    	cq.addLast(50);
    	cq.addLast(60);
    	cq.display();
    }
}
