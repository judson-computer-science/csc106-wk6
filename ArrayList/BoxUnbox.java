import java.util.*;

public class BoxUnbox {

	public static void main(String[] args) {
		
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(1);
		ages.add(Integer.valueOf(2));

		Integer firstObject = ages.get(0);
		Integer secondObject = ages.get(1);

		int firstPrim = ages.get(0);
		int secondPrim = ages.get(1);

		System.out.printf("Objects: %d, %d\n", firstObject, secondObject);
		System.out.printf("Primitives: %d, %d\n", firstPrim, secondPrim);
	}
}
