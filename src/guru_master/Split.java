package guru_master;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "Hello Good Morning";
		String output="";
		String[] arr= input.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=arr[i].length()-1; j>=0; j--)
		{
			output=output + arr[i].charAt(j);
			
		}
			output=output + " ";
		}
		System.out.println(output);
	}

}
