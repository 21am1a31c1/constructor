package guru_master;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "my name is guruprasad";
		String[] arr= input.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			String s=arr[i].substring(0,1);
			s=s.toUpperCase();
			s=s+arr[i].substring(1);
			s=s+" ";
			System.out.print(s);
		
		}
		
	}

}
