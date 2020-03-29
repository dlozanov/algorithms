package mainApp;

import data.Data;
import data.Data2;
import dynamicData.DoubleLinkedList;
import dynamicData.LinkedList;

public class MainApp {
	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
		DoubleLinkedList list = new DoubleLinkedList();
		list.add(1, "zdrastiii");
		list.add(2, "3");
		list.add(3, "2");
		list.add(4, "5");
		list.add(5, "sdfds");
//		list.add( new Data(16, "nov element"));
		list.add( new Data2(16, "nov element"));
		list.print();
		list.printFromEnd();
		list.printElem( list.get(16) );
		list.printElem( list.get(1) );
		list.printElem( list.getFromEnd(16) );
		list.printElem( list.getFromEnd(1) );
		System.out.println( "delete 3" );
		list.printElem( list.delete(3) );
		list.printFromEnd();
		System.out.println( "delete 1" );
		list.printElem( list.delete(1) );
		list.printFromEnd();
		System.out.println( "delete 16" );
		list.printElem( list.delete(16) );
		list.printFromEnd();
	}
}
