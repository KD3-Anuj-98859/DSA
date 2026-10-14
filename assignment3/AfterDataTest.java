package assignment3;

public class AfterDataTest {
     public static void main(String[] args) {
    	 LinkedList ll=new LinkedList();
    	 ll.addLast(10);
    	 ll.addLast(20);
    	 ll.addLast(30);
    	 ll.addLast(40);
    	 ll.addLast(50);
    	 ll.addLast(60);
    	 ll.addLast(70);
    	 //ll.display();
	 
        
         ll.beforeData(55,10);
         ll.display();
     
     }
}
