package guru_master;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "HELLO GOOD MORNING";
		int vowel_count=0;
		input=input.toLowerCase();
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
			{
				vowel_count++;
			}
		}
		System.out.println("The no of vowels are:"+vowel_count);
	}

}
