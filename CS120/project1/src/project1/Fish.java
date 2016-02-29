package project1;

public class Fish {
	
	protected String type; 
	protected String color;
	protected String name; 
	
	protected void setColor(String newType) {
		type = newType; 
	}
	
	protected void setShape(String newColor) {
		color = newColor; 
	}
	
	protected void setGrow(String newName) {
		name = newName; 
	}
	
	protected String getType() {
		return type; 
	}
	
	protected String getColor() {
		return color; 
	}
	
	protected String getName() {
		return name; 
	}
	
	

}
