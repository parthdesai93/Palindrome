package palindrome;

public class Palindrome {
	int steps =  0;
	int finput;
	public int getNumberOfSteps(int input){
		
		String palindrome = Integer.toString(input);
		String reverse = new StringBuilder(palindrome).reverse().toString();
		 
		
		if(reverse.equals(palindrome)){
			
			int answer = Integer.parseInt(palindrome);
			System.out.println(steps);
			return answer; 
		
		} else{
			
			int firstNumber = input; 
			int secondNumber = Integer.parseInt(reverse);
			int sum = firstNumber+secondNumber; 
			getNumberOfSteps(sum);
			steps++;
		}
		
		return 0;
	}
	
	
	
	
}
