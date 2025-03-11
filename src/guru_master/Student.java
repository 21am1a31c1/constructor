package guru_master;

public class Student {
int roll;
String name;
Student()
{
	System.out.println("First constructor");
}
Student(String name, int roll)
{
	this (name);
	System.out.println("third.constructor");
}
Student(String name)
{
	this();
	System.out.println("Second constructor");
}
}
