package data;

import java.time.LocalDateTime;

public class Data3 {
	public int key;
	public String data;
	public LocalDateTime dateTime;
	public Data3 left;
	public Data3 right;
	public Data3 parent;
	
	public Data3( int key, String data ) {
		this.key = key;
		this.data = data;
		dateTime = LocalDateTime.now();
		left = null;
		right = null;
		parent = null;
	}
}
