import java.util.*;

public class HelloList {
	public static void main(String abs[]) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(-1);
		numbers.add(-999);
		numbers.add(58);
		numbers.add(2);
		System.out.println("Numbers b4 sorting");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("After sorting");
		Collections.sort(numbers);
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}

