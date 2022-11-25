https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
import java.util.List;
import java.util.Map;

/**
 * This module is the entry point to your assignment. There is some scaffolding
 * to help you get started. It will call the appropriate method and load the
 * input data. You can edit or remove as much of this code as you wish to.
 */

public class Main {

	/*
	 * For each string, decide if it is in the language.
	 */
	public static void membership(Parser parser) {
		Map<String, Object> cfg = parser.parseCfg();
		List<String> testStrings = parser.parseTestStrings();
		// TODO: implement this
		System.out.println("TODO: print 0 or 1 per string");
	}

	/*
	 * Give a rightmost derivation of the string.
	 */
	public static void rightmostDerivation(Parser parser) {
		Map<String, Object> cfg = parser.parseCfg();
		String testString = parser.parseTestString();
		// TODO: implement this
		System.out.println("TODO: print a rightmost derivation of the string");
	}

	/*
	 * For each string, decide if it is in the language.
	 */
	public static void ambiguous(Parser parser) {
		Map<String, Object> cfg = parser.parseCfg();
		List<String> testStrings = parser.parseTestStrings();
		// TODO: implement this
		System.out.println("TODO: print 0 or 1 per string");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Parser parser = new Parser();

		String command = parser.parseCommand();
		switch (command) {
		case "membership":
			membership(parser);
			break;
		case "rightmost-derivation":
			rightmostDerivation(parser);
			break;
		case "ambiguous":
			ambiguous(parser);
			break;
		default:
			System.out.println(String.format("Command %s not recognised.", command));
		}
	}
}
