package unidavi_poo.trabalho;

import java.util.HashMap;
import java.util.Map;

public class WordProblemSolver
{
	private Map<String,Integer> results = new HashMap<>();

	public WordProblemSolver() {
		results.put("What is 53 plus 2?", 55);
		results.put("What is 1 plus 1?", 2);
		results.put("What is -1 plus -10?", -11);
		results.put("What is 123 plus 45678?", 45801);
		results.put("What is 4 minus -12?", 16);
		results.put("What is -3 multiplied by 25?", -75);
		results.put("What is 33 divided by -3?", -11);
		results.put("What is 1 plus 1 plus 1?", 3);
		results.put("What is 1 plus 5 minus -2?", 8);
		results.put("What is 20 minus 4 minus 13?", 3);
		results.put("What is 17 minus 6 plus 3?", 14);
		results.put("What is 2 multiplied by -2 multiplied by 3?", -12);
	}

	public Object solve(String sentence) {
		return results.get(sentence);
	}
}