package data;

import java.time.LocalDateTime;

public class Data2 {
	public int key;
	public String data;
	public LocalDateTime dateTime;
	public Data2 next;
	public Data2 prev;
	
	public Data2( int key, String data ) {
		this.key = key;
		this.data = data;
		dateTime = LocalDateTime.now();
		next = null;
		prev = null;
	}
}
