/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Mar 04 2019
 * Created for: ICS4U
 * MrCoxallStack class
 *
 ****************************************************************************/

import java.util.ArrayList;

public class MrCoxallStack {
	private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
	private static String updates = "";
	
	public String print() {
		//prints entire stack
		updates = "\nStack: " + stackArray;
		return updates;
	}
	
	public String push(int value) {
		//adds value to stack
		stackArray.add(value);
		updates = (value) + " was added.";
		return updates;
	}
}
