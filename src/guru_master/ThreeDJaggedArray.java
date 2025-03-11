package guru_master;

import java.util.Scanner;

public class ThreeDJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no of organizations:");
		 int m=sc.nextInt();
		 System.out.println("Enter the no of companies:");
		 int n=sc.nextInt();
		 String[][][] arr=new String[m][n][];
		 //jagged array
		 for(int i=0; i<arr.length; i++)
		 {
			 for(int j=0; j<arr.length; j++)
			 {
			 System.out.println("Enter the no of employees for each company"+
			 (j+1)+" org no"+(i+1));
			 arr[i][j]=new String[sc.nextInt()];
			 }
		 }
		 //storing
		 for(int i=0; i<m; i++)
		 {
			 for(int j=0; j<n; j++)
			 {
				 for(int k=0; k<arr[i].length; k++)
				 {
				 System.out.println("Enter the name of employee no:"+(k+1)+"for each company no:"+(j+1)+"in the organization:"+(i+1));
				 arr[i][j][k]=sc.next();
				 } 
			 }
		 }
			 //retriving
			 for(int i=0; i<m; i++)
			 {
				 for(int j=0; j<n; j++)
				 {
					 for(int k=0; k<arr[i].length; k++)
					 {
					 System.out.println("The name of employee no:"+(k+1)+"for each company no:"+(j+1)+"in the organization:"+(i+1)+"is:"+arr[i][j][k]);
			 }
			 }
			 }
	}

}
