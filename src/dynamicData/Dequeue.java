package dynamicData;

import data.Data;
import data.Data2;

public class Dequeue {
	Data2 head;
	Data2 tail;
	
	public void addBeg( Data2 d ) {
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
			head.prev = d;
			d.next = head;
			head = d;
		}
	}
	
	public void addBeg( int key, String data ) {
		Data2 d = new Data2( key, data );
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
			head.prev = d;
			d.next = head;
			head = d;
		}
	}
	
	public void addEnd( Data2 d ) {
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
			d.prev = tail;
			tail = d;
		}
	}
	
	public void addEnd( int key, String data ) {
		Data2 d = new Data2( key, data );
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
			d.prev = tail;
			tail = d;
		}
	}
	
	public Data2 getBeg() {
		Data2 p = head;
		if( p != null ) {
			return p;
		}
		return null;
	}
	
	public Data2 getEnd() {
		Data2 p = tail;
		if( p != null ) {
			return p;
		}
		return null;
	}
	
	public Data2 deleteBeg() {
		Data2 p = head;
		if( p != null ) {
			head = p.next;
			if( p.next != null )
				p.next.prev = null;
			if( tail == p )
				tail = null;
			return p;
		}
		return null;
	}
	
	public Data2 deleteEnd() {
		Data2 p = tail;
		if( p != null ) {
			tail = p.prev;
			if( p.prev != null ) {
				p.prev.next = null;
			}
			if( head == p )
				head = null;
			return p;
		}
		return null;
	}
	
	public void print() {
		Data2 p = head;
		while( p != null ) {
			System.out.println( p.key + " " + p.data + " " + p.dateTime.toString() );
			p = p.next;
		}
	}
	
	public void printEnd() {
		Data2 p = tail;
		while( p != null ) {
			System.out.println( p.key + " " + p.data + " " + p.dateTime.toString() );
			p = p.prev;
		}
	}
}
