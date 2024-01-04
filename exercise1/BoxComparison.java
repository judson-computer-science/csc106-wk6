import java.util.*;

public class BoxComparison {

	public static void main(String[] args) {

		Box b1 = new Box(9,10,8);
		Box b2 = new Box(11,1,1);
		Box b3 = new Box(5,8,5);
		Box b4 = new Box(2,22,2);
		Box b5 = new Box(8,1,4);

		Box[] boxes = { b1, b2, b3, b4, b5 };

		BoxSorter sorter = new BoxSorter(boxes);

		System.out.println("Sorted Lengths: " + 
                                  Arrays.toString(sorter.getSortedLengths()));
		System.out.println("Sorted Lengths: " + 
                                  Arrays.toString(sorter.getSortedLengths(3)));
		System.out.println("Sorted Volumes: " + 
                                  Arrays.toString(sorter.getSortedVolumes()));
		System.out.println("Largest Area: " + sorter.getLargestArea());
	}
}

