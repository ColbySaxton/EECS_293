import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import java.util.HashMap;

public class GoneTester {

	Pebble pebble0 = new Pebble("black", 0, 0);
	Pebble pebble1 = new Pebble("white", 0, 1);
	Pebble pebble2 = new Pebble("white", 2, 2);
	Pebble pebble3 = new Pebble("white", 2, 1);
	Tuple tuple0 = new Tuple(0, 0);
	Tuple tuple1 = new Tuple(0, 1);
	Tuple tuple2 = new Tuple(2, 2);
	Tuple tuple3 = new Tuple(2, 1);
	public static HashMap<Tuple, Pebble> hashMap0 = new HashMap<Tuple, Pebble>();
	public static HashMap<Tuple, Pebble> hashMap1 = new HashMap<Tuple, Pebble>();
	
	@Test
	public void testBlackPebblesLeft() {
		hashMap0.put(tuple0, pebble0);
		hashMap0.put(tuple1, pebble1);
		hashMap0.put(tuple2, pebble2);
		hashMap1.put(tuple1, pebble1);
		hashMap1.put(tuple2, pebble2);
		hashMap1.put(tuple3, pebble3);
		Board board0 = new Board(2, 2, hashMap0);
		Board board1 = new Board(2, 2, hashMap1);
		Gone gone0 = new Gone();
		assertFalse(gone0.blackPebblesLeft(board0));
		assertTrue(gone0.blackPebblesLeft(board1));
	}

}
