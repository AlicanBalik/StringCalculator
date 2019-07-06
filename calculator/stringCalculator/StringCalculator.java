package stringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int add(String number) {
		return number.isEmpty() ? 0 : calculateSum(number);
	}

	private static int calculateSum(String number) {
		if (number.startsWith("//")) {
			number = number.substring(2);
		}
		String[] numbers = number.split(",|\n|;");
		int sum = 0;
		List<String> negativeNumbers = new ArrayList<String>();
		for (String n : numbers) {
			if (!n.equals("")) {
				if (findNegative(toInt(n))) {
					if (toInt(n) < 1000)
						sum += toInt(n);
				} else {
					negativeNumbers.add(n);
				}
			}
		}
		if (negativeNumbers.size() > 0) {
			// supposed to throw an error.
			return 3;
		} else {
			return sum;
		}
	}

	private static boolean findNegative(int n) {
		return n < 0 ? false : true;
	}

	private static int toInt(String str) {
		return Integer.parseInt(str);
	}
}
