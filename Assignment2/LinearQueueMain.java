package Assignment2;

public class LinearQueueMain {
	public static void main(String[] args) {
         LinearQueue lq=new LinearQueue();
         lq.offer(10);
         lq.offer(20);
         lq.offer(30);
         lq.offer(40);
         lq.offer(50);
         lq.offer(60);
         System.out.println(lq.pop());
         System.out.println(lq.pop());
         System.out.println(lq.pop());
         System.out.println(lq.pop());
         System.out.println(lq.pop());
         System.out.println(lq.pop());
         System.out.println(lq.peek());
         
	}
}
