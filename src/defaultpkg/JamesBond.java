package defaultpkg;

import java.util.regex.*;

public class JamesBond {
	public static Boolean bondRegex(String input) {
		Pattern pattern = Pattern.compile("(\\d|\\))*\\((\\d|\\)|\\()*007(\\d|\\)|\\()*\\)(\\d|\\(|\\))*");
		return pattern.matcher(input).find();
	}
} 