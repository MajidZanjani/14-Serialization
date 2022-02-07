package javaSerialization;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
