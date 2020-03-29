package data;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Data {
	public int key;
	public String data;
	public LocalDateTime dateTime;
	public Data next;
	
	public Data( int key, String data ) {
		this.key = key;
		this.data = data;
		dateTime = LocalDateTime.now();
		next = null;
	}
}
