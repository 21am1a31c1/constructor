package guru_master;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10 , b=20, c=30;
		float a1=10.11f, b1=20.22f, c1=30.33f;
		double a2=100.11d, b2=200.22d, c2=300.33d;
		Calculator cal=new Calculator();
		System.out.println(cal.add(a, b));
		System.out.println(cal.add(a, b1));
		System.out.println(cal.add(a, b1, c2));
		System.out.println(cal.add(a, c2, b1));
		System.out.println(cal.add(a2, b, c1));
		//System.out.println(cal.add(a1, b2, c));
		System.out.println(cal.add(a, b, c));
		System.out.println(cal.add(a1, b1));

	}

}
