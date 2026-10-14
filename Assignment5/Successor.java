package Assignment5;

public class Successor {
    public static void main(String[] args){
    	BST b=new BST();
    	b.add(8);
    	b.add(3);
    	b.add(10);
    	b.add(2);
    	b.add(6);
    	b.add(15);
    	b.add(4);
    	b.add(7);
    	b.add(14);
    	b.preOrder();
    	b.inOrder();
    	System.out.println();
    	System.out.println(b.successor(6));
    	System.out.println("deapth : "+b.deapth(99));
    	
    } 
    	
    }


