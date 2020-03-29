package dynamicData;

import data.Data;

public class LinkedList {
	Data head = null;
	
	public void add( Data data ) {
		if( head == null ) {
			head = data;
		}
		else {
			data.next = head;
			head = data;
		}
	}
	
	public void add( int key, String data ) {
		if( head == null ) {
			head = new Data(key, data);
		}
		else {
			Data d = new Data(key, data);
			d.next = head;
			head = d;
		}
	}
	
	public Data get( int key ) {
		Data p = head;
		while( p != null ) {
			if( p.key == key )
				return p;
			else
				p = p.next;
		}
		return null;
	}
	
	public Data delete( Data data ) {
		Data p = head, prev = null;
		while( p != null ) {
			if( p.key == data.key ) {
				if( prev == null ) {
					head = p.next;
					return p;
				}
				else {
					prev.next = p.next;
					return p;
				}
			}
			else {
				prev = p;
				p = p.next;
			}
		}
		return null;
	}
	
	public Data delete( int key ) {
		Data p = head, prev = null;
		while( p != null ) {
			if( p.key == key ) {
				if( prev == null ) {
					head = p.next;
					return p;
				}
				else {
					prev.next = p.next;
					return p;
				}
			}
			else {
				prev = p;
				p = p.next;
			}
		}
		return null;
	}
	
	public void print() {
		Data p = head;
		if( p != null ) {
			do {
				System.out.println( p.key + " " + p.data + " " + p.dateTime.toString() );
				p = p.next;
			}while( p != null );
		}
	}
	
	public void printElem( Data d ) {
		System.out.println( d.key + " " + d.data + " " + d.dateTime.toString() );
	}
}
