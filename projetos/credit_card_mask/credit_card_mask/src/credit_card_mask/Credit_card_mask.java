package credit_card_mask;

public class Credit_card_mask {
	public static String maskify(String str) {
		if (str.length() <= 4)
			return str;
		String result = "";
		for (int i = 0; i < str.length() - 4; i++) {
			result += "#";
		}
		return result + str.substring(str.length() - 4);
	}

	public static void main(String[] args) {

	}
}
