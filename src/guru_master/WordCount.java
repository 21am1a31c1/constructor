package guru_master;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "   HELLO  GOOD  MORNING";
		int word_count=0;
		input=input.trim();
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)==' ' && input.charAt(i+1)!=' ')
			{
				word_count++;
			}
		}
		
		System.out.println("The no of words are:"+ ++word_count);
	}

}
