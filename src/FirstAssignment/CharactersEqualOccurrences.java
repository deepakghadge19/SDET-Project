package FirstAssignment;

public class CharactersEqualOccurrences {

	public static void main(String[] args) {
		boolean b1;
		b1 = areOccurrencesEqual("abacbc");
		b1 = areOccurrencesEqual("shambhu");
		System.out.println("String abacbc is : " + b1);
		b1 = areOccurrencesEqual("aaabb");
		System.out.println("String aaabb is : " + b1);
	}

	public static boolean areOccurrencesEqual(String s) {
		int[] counts = new int[26];
		int max = 0;

		for (char c : s.toCharArray()) {
			counts[c - 'a']++;
			max = Math.max(max, counts[c - 'a']);
		}

		for (int count : counts) {
			if (count != 0 && count != max) {
				return false;
			}
		}
		return true;
	}
}
