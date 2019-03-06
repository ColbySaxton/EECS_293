
/*
 * This class is a Tuple which holds the values of an x/y coordinate pair.
 */
public class Tuple {
	
	private final int x;
	private final int y;
	
	/*
	 * Standard Constructor.
	 */
	public Tuple(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/*
	 * Standard getters.
	 */
	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}
	
	/*
	 * Overridden equals method that returns true if the input tuple's x and y coordinates match those of the this tuple's.
	 */
	public boolean equals(Tuple tuple) {
		return (getY() == tuple.getY() && getX() == tuple.getX());
	}
	
	/*
	 * Overriden hashCode method that returns a unique hashcode for each tuple no matter the input x and y values.
	 */
	public int hashCode() {
		return (31 * Double.hashCode(getX())) + Double.hashCode(getY());
	}
}
