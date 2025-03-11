package guru_master;

import java.util.Scanner;

public class TwoDJackedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the no of companies:");
 int m=sc.nextInt();
 String[][] arr=new String[m][];
 //jagged array
 for(int i=0; i<arr.length; i++)
 {
	 System.out.println("Enter the no of employees in company no:"+(i+1));
	 arr[i]=new String[sc.nextInt()];
 }
 //storing
 for(int i=0; i<m; i++)
 {
	 for(int j=0; j<arr[i].length; j++)
	 {
		 System.out.println("Enter the name of employee no"+(j+1)+"from company no"+(i+1));
		 arr[i][j]=sc.next();
	 }
 }
	 //retriving
	 for(int i=0; i<m; i++)
	 {
		 for(int j=0; j<arr[i].length; j++)
		 {
			 System.out.println("The name of employee no"+(j+1)+"from company no"+(i+1)+"is"+arr[i][j]);
		 }
	 }
 
	}

}
