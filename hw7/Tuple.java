
public class Tuple {
	
	private final int x;
	private final int y;
	
	public Tuple(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}
	
	public boolean equals(Tuple tuple) {
		return (getY() == tuple.getY() && getX() == tuple.getX());
	}
	
	public int hashCode() {
		return (31 * Double.hashCode(getX())) + Double.hashCode(getY());
	}
}
