package mainApp;

import data.Data;
import data.Data2;
import dynamicData.Dequeue;
import dynamicData.DoubleLinkedList;
import dynamicData.LinkedList;
import dynamicData.Queue;
import dynamicData.Stack;

public class MainApp {
	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		DoubleLinkedList list = new DoubleLinkedList();
//		Queue list = new Queue();
//		Dequeue list = new Dequeue();
		Stack list = new Stack();
		list.add(1, "zdrastiii");
		list.add(2, "3");
		list.add(3, "2");
		list.add(4, "5");
		list.add(5, "sdfds");
		list.add( new Data(16, "nov element"));
//		list.addEnd(1, "zdrastiii");
//		list.addBeg(2, "3");
//		list.addEnd(3, "2");
//		list.addBeg(4, "5");
//		list.addEnd(5, "sdfds");
//		list.addBeg( new Data2(16, "nov element"));
//		list.add( new Data2(16, "nov element"));
		list.print();
//		list.printFromEnd();
//		list.printElem( list.get(16) );
//		list.printElem( list.get(1) );
//		list.printElem( list.getFromEnd(16) );
//		list.printElem( list.getFromEnd(1) );
		System.out.println( "delete 3" );
//		list.printElem( list.delete(3) );
		list.delete();
		list.print();
		System.out.println( "delete 1" );
//		list.printElem( list.delete(1) );
		list.delete();
		list.print();
		System.out.println( "delete 16" );
//		list.printElem( list.delete(16) );
		list.delete();
		list.print();
		System.out.println( "delete 2" );
//		list.printElem( list.delete(2) );
		list.delete();
		list.print();
		System.out.println( "delete 4" );
//		list.printElem( list.delete(4) );
		list.delete();
		list.print();
		System.out.println( "delete 5" );
//		list.printElem( list.delete(5) );
		list.delete();
		list.print();
	}
}
