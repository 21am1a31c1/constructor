package guru_master;

public class ReversWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "Hello Good Morning";
 		String output=" ";
		for(int i=input.length()-1; i>=0; i--)
		{
			output=output + input.charAt(i);
			
		}
		
		System.out.println(output);
	}

}
