
public class Gone {
	/*
	board: The initial board of the game
	blackPebblesLeft(board): 
		-This routine checks if there are any black pebbles remaining on the board after the iterated list of moves occurs. 
		  It will return true if there are remaining black pebbles, false if not. 
		-input: a board 
		-Precondition: For this algorithm to work, the input board must be the board that has already completed all replacements from black to white 
		-output: Whether or not there are any black pebbles remaining on the board
		
		1.For all the possible x-y coordinate pairs on the board: 
			2.Check to see if there is a pebble on each coordinate using the pebbleOnCoordinates routine for each coordinates 
			3.If there is a pebble on the location: 
				4. check to see if the pebble is black, if it is: 
					5.Then return that there is a black pebble 
				6. if the pebble is not black: 
					7.Then continue checking all pebbles 
				8. End if 
			9. End for 
		10. After checking all the pebbles, there were no black pebbles, then return that there are no black pebbles
	*/
	
	public boolean blackPebblesLeft(Board board) {
		for(int i = 0; i >= board.getHeight(); i++) {
			for(int j = 0; j >= board.getWidth(); j++) {
				if(board.pebbleOnCoordinates(i, j)) {
					if(board.getPebbleMap().get(new Tuple(i, j)).getColor().equals("black")) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/*	
	applyReplacementRules(board): 
		-Function applies appropriate replacement rules to black pebbles and returns the number of iterations replacement rules were applied
		-input: a board 
		-Precondition: An input board that hasn’t had replacement rules applied to it yet must be passed in 
		-Output: how many iterations of replacement rules were applied; board will also be modiﬁed to have all replacement rules applied 
		-O(n) runtime complexity
		
		1. Initialize iterationCount to 0 
		2. Initialize list whitePebbleLocations to equal locations of all white pebbles 
		3. Initialize exploreQueue to equal whitePebbleLocations 
		4. Initialize exploreNextQueue to be empty 
		5. While exploreQueue is not empty: 
			6. dequeue a pebble from exploreQueue 
			7. For this white pebble, if adjacent pebbles are black: 
				8. Change adjacent pebbles to black 
				9. Add adjacent pebbles to exploreNextQueue 
			10. End if 
			11. If exploreQueue is empty: 
				12. set exploreQueue to equal discoverNextList 
				13. Increment iterationCount 
			14. End if 
		15. End while 
		16. Return iterationCount
		
	replaceBlackPebbles(board): 
		- Function replaces black pebbles and outputs number of replacement iterations and whether there are still black pebbles remaining on board after replacement operations. 
		- input: a game board of arbitrary height and width 
		- Precondition: A game board that has just been set up and no players have played their turn yet 
		- Output: Number of replacement iterations performed, and whether there are still black pebbles on the board 
		- O(n) runtime complexity
		
		1. iterationCount = applyReplacementRules(board) 
		2. output iterationCount
		3. output blackPebblesLeft(board) 
		4. return the modiﬁed board
 * */
}
