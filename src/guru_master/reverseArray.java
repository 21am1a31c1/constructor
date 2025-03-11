package guru_master;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50};
		//int []temp=new int[arr.length];
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int var:arr)
		{
			System.out.println(var);
		}
	}

}
