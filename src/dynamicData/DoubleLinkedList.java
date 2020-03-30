package dynamicData;

import data.Data;
import data.Data2;

public class DoubleLinkedList {
	Data2 head = null;
	Data2 tail = null;
	
	public void add( Data2 data ) {
		if( head == null && tail == null ) {
			head = data;
			tail = data;
		}
		else if( head == null ) {
			head = data;
		}
		else if( tail == null ) {
			tail = data;
		}
		else {
			data.next = head;
			head.prev = data;
			head = data;
		}
	}
	
	public void add( int key, String data ) {
		Data2 d = new Data2(key, data);
		if( head == null && tail == null ) {
			head = d;
			tail = head;
		}
		else if( head == null ) {
			head = d;
		}
		else if( tail == null ) {
			tail = d;
		}
		else {
			d.next = head;
			head.prev = d;
			head = d;
		}
	}
	
	public Data2 get( int key ) {
		Data2 p = head;
		while( p != null ) {
			if( p.key == key )
				return p;
			else
				p = p.next;
		}
		return null;
	}
	
	public Data2 getFromEnd( int key ) {
		Data2 p = tail;
		while( p != null ) {
			if( p.key == key )
				return p;
			else
				p = p.prev;
		}
		return null;
	}
	
	public Data2 delete( Data2 data ) {
		Data2 p = head, prev = null;
		while( p != null ) {
			if( p.key == data.key ) {
				if( prev == null ) {
					head = p.next;
					if( p.next != null )
						p.next.prev = null;
					if( p == tail )
						tail = null;
					return p;
				}
				else {
					prev.next = p.next;
					if( p.next != null )
						p.next.prev = p.prev;
					if( p == tail )
						tail = p.prev;
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
	
	public Data2 delete( int key ) {
		Data2 p = head, prev = null;
		while( p != null ) {
			if( p.key == key ) {
				if( prev == null ) {
					head = p.next;
					if( p.next != null )
						p.next.prev = null;
					if( p == tail )
						tail = null;
					return p;
				}
				else {
					prev.next = p.next;
					if( p.next != null )
						p.next.prev = p.prev;
					if( p == tail )
						tail = prev;
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
		Data2 p = head;
		if( p != null ) {
			do {
				System.out.println( p.key + " " + p.data + " " + p.dateTime.toString() );
				p = p.next;
			}while( p != null );
		}
	}
	
	public void printFromEnd() {
		Data2 p = tail;
		if( p != null ) {
			do {
				System.out.println( p.key + " " + p.data + " " + p.dateTime.toString() );
				p = p.prev;
			}while( p != null );
		}
	}
	
	public void printElem( Data2 d ) {
		System.out.println( d.key + " " + d.data + " " + d.dateTime.toString() );
	}
}
