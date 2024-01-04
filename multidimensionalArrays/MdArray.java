// this example illustrates how to use multi-dimensional arrays
public class MdArray {

	public static void main(String[] args) {

		int[][] vals = {
			{ 1, 2 },
			{ 3, 4 },
			{ 5, 6 },
			{ 7, 8 },
			{ 9, 10 }
		};

		for(int i=0; i<vals.length; i++) {
			for(int j=0; j<vals[i].length; j++) {
				System.out.println(vals[i][j]);
			}
		}
	}
}
