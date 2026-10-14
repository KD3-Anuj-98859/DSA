package assignment3;

public class SortedTest {
   public static void main(String[] args) {
	   SortedLinkedList slt=new SortedLinkedList();
	   slt.addSortedOrder(30);
	   slt.addSortedOrder(20);
	   slt.addSortedOrder(40);
	   slt.addSortedOrder(20);
	   slt.beforeData(50, 20);
	   
	   slt.display();
   }
}