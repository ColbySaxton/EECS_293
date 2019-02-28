import java.util.HashMap;

public class Board {
	/*
	height = The number of pebbles that can vertically ﬁt on the board 
	width = The number of pebbles that can horizontally ﬁt on the board 
	pebbleMap = A map of pebbles where the key of a pebble is its unique integer value from the getPairing method
	*/
	
	private int height;
	private int width;
	HashMap<Tuple, Pebble> pebbleMap;
	
	public Board(int height, int width, HashMap<Tuple, Pebble> pebbleMap) {
		super();
		this.height = height;
		this.width = width;
		this.pebbleMap = pebbleMap;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public HashMap<Tuple, Pebble> getPebbleMap() {
		return pebbleMap;
	}

	/*
	pebbleOnCoordinates(x, y) 
		-input: the x and y coordinates of the location to check if there is a pebble
		-output: Whether or not there is a pebble located at this coordinate
		
		1. take the input x and y coordinates and put them into the getPairing routine to get the unique integer value for it 
		2. Check to see if the unique integer value found above is a key existing in pebbleMap 
		3. If there is a pebble in the map for this unique integer value: 
			4. Then return that there is a pebble on these coordinates 
		5. If there is not a pebble in the map for this unique integer value: 
			6.Then return that there is not a pebble on these coordinates 
		7. End if
	*/
	
	public boolean pebbleOnCoordinates(int x, int y) {
		Tuple thisTuple = new Tuple(x, y);
		return pebbleMap.containsKey(thisTuple);
	}
	
	/*	
	getPairing(x, y) 
		- This routine returns a unique integer value from a x and y coordinate 
		- input: an x and y coordinate 
		- output: a value that represents a unique non-negative integer value made from the thisX and thisY values
		
		1. Let thisX represent the x coordinate 
		2. Let thisY represent the y coordinate 
		3. return a value that represents a unique non-negative integer value made from the thisX and thisY values
	*/
}
