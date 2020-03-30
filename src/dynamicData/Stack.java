package dynamicData;

import data.Data;

public class Stack {
	Data head;
	
	public void add( Data d ) {
		if( head == null ) {
			head = d;
		}
		else {
			d.next = head;
			head = d;
		}
	}
	
	public void add( int key, String data ) {
		Data d = new Data( key, data );
		if( head == null) {
			head = d;
		}
		else {
			d.next = head;
			head = d;
		}
	}
	
	public Data get() {
		Data p = head;
		if( p != null ) {
			return p;
		}
		return null;
	}
	
	public Data delete() {
		Data p = head;
		if( p != null ) {
			head = p.next;
			return p;
		}
		return null;
	}
	
	public void print() {
		Data p = head;
		while( p != null ) {
			System.out.println( p.key + " " + p.data + " " + p.dateTime.toString() );
			p = p.next;
		}
	}
}
