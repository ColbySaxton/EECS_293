
public class Pebble {
	/*
	color = The color of the pebble 
	x = the x-coordinate location of the pebble on the board 
	y = the y coordinate location of the pebble on the board
	*/
	
	String color;
	int x;
	int y;
	
	public Pebble(String color, int x, int y) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	/*
	This routine returns the color of this pebble 
	getColor() 
		return color
	*/
	
	public String getColor() {
		return color;
	}
	
	/*	
	This routine returns the x coordinate of this pebble 
	getXCoordinate() 
		return x
	*/
	
	public int getXCoordinate() {
		return x;
	}
	
	/*	
	This routine returns the y coordinate of this pebble 
	getYCoordinate() 
		return y
	*/
	
	public int getYCoordinate() {
		return y;
	}
}
