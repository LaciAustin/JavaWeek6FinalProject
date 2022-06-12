package week6CodingAssignment;

public class Card {
	//Fields
	private int value;
	private String name;
	
	
	
	
	
	
		
	//Methods
	//Getters & Setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getname() {
		return name;
	}
	public void setname(String name)	{
		this.name = name;
	}

	//Describe
	public void describe() {
		System.out.println(name + " " + value);
	}
	
	}


