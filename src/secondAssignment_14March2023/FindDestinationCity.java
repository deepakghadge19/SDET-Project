package secondAssignment_14March2023;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDestinationCity {

	public static void main(String[] args) {
		String input[][] = { { "London", "Newyork" }, { "Newyork", "Lima" }, { "Lima", "Sao Paulo" } };
		// String input[][] = { { "B", "C" }, { "D", "B" }, { "C", "A" } };
		ArrayList<String> AL = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < 2; j++) {
				AL.add(input[i][j]);
			}
		}
		Set<String> S = new LinkedHashSet<>(AL);
		ArrayList<String> AL1 = new ArrayList<>(S);
		System.out.println(AL1.get(AL1.size() - 1));
	}
}
