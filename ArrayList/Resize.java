import java.util.*;

public class Resize {

	public static void main(String[] args) {
		
		int[] myInts = { 1, 2, 3, 4, 5 };

		// declare 2 lists with capacity 2
		int[] list1 = new int[2];
		ArrayList<Integer> list2 = new ArrayList<>(2);

		for(int i=0; i<myInts.length; i++) {

			list1[i] = myInts[i]; // throws Exception
			list2.add(myInts[i]); // ArrayList resized
		}

	}
}
