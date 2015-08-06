package palindrome;

public class Main {
	public static void main(String[] args){
		Palindrome pal = new Palindrome();
		int[] input = {24};
		for(int i:input){
			pal.getNumberOfSteps(i);
		}
	}
}
