package dynamicData;

import data.Data;

public class Queue {
	Data head;
	Data tail;
	
	public void add( Data d ) {
		if( head == null && tail == null ) {
			head = d;
			tail = d;
		}
		else if( head == null ) {
			head = d;
		}
		else if( tail == null ) {
			tail = d;
		}
		else {
			tail.next = d;
			tail = d;
		}
	}
	
	public void add( int key, String data ) {
		Data d = new Data( key, data );
		if( head == null && tail == null ) {
			head = d;
			tail = d;
		}
		else if( head == null ) {
			head = d;
		}
		else if( tail == null ) {
			tail = d;
		}
		else {
			tail.next = d;
			tail = d;
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
			if( tail == p )
				tail = null;
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
