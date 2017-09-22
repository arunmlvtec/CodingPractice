package practice;

public class StringEReduction {
	public String reduceString(String input){
		if (input == null)
			return null;
		if (input.length() == 1)
			return input;
		boolean flag = false;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++){
			if (((input.charAt(i) == 'e') && !flag) || input.charAt(i) != 'e'){
				output.append(input.charAt(i));
				if (input.charAt(i) == 'e') {
					flag = true;
				}
				else {
					flag = false;
				}
			}
		}
		return output.toString();
	}
}
