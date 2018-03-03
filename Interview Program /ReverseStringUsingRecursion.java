package Interview.programs;

public class ReverseStringUsingRecursion {

	//khushboo
	public static void main(String[] args) {
		ReverseStringUsingRecursion r1 = new ReverseStringUsingRecursion();
		String ans = r1.findReverse("Khushboo");
		System.out.println("Reversed String = "+ans);
	}

	private String findReverse(String string) {
		// o   khushbo    oo   khushb   oobXj
		String reverse = "";
		if (string.length() == 1) {
			return string;
		}else {
			 System.out.println("Char at "+string.charAt(string.length()-1)+" AND substring = "+string.substring(0, string.length()-1));
			reverse = reverse + string.charAt(string.length()-1) + findReverse(string.substring(0, string.length()-1));
		}
		return reverse;
		
	}
}
