
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NthLargestElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = 3;

		Set nums = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			nums.add(arr[i]);
		}
		List l = new ArrayList();
		l.addAll(nums);
		System.out.println("First largest element:" + l.get(l.size() - 1));
		Collections.sort(l);
		System.out.println("Nth largest element:" + l.get(l.size() - n));

	}

}
