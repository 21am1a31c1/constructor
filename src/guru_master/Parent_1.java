package guru_master;

public class Parent_1 {
void eat()
{
	System.out.println("Parent eats");
}
void sleep()
{
	System.out.println("Parent sleeps early");
}
void run()
{
	System.out.println("Parent runs briskly");
}
}
class Child_1 extends Parent_1
{
	@Override
	void sleep()
	{
		System.out.println("Child sleeps late");
	}
	void swims()
	{
		System.out.println("Child swims");
	}
}