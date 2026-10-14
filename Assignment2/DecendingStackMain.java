package Assignment2;

public class DecendingStackMain {
     public static void main(String[] args) {
    	 DecendingStack dstk=new DecendingStack(10);
    	 dstk.push(90);
    	 dstk.push(80);
    	 dstk.push(70);
    	 dstk.push(60);
    	 dstk.push(50);
    	 dstk.push(40);
    	 dstk.push(30);
    	 dstk.push(20);
    	 dstk.push(10);
    	 System.out.println(dstk.pop());
    	 System.out.println(dstk.pop());
    	 System.out.println(dstk.pop());
    	 System.out.println(dstk.pop());
    	 System.out.println(dstk.pop());
    	 
     }
}
