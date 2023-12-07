package string_ends_with;

public class String_ends_with {
	public static boolean solution(String str, String ending) {

		return str.endsWith(ending);
	}

	public static void main(String[] args) {
		System.out.println(solution("samurai", "ra"));
	}
}
