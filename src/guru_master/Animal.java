package guru_master;

public class Animal {
private String name;
private String size;
private String color;
private int age;
Animal(String name,String size,String color,int age)
{
	name=name;
	size=size;
	color=color;
	age=age;
}
public String getName()
{
	return name;
}
public String getSize()
{
	return size;
}
public String getColor()
{
	return color;
}
public int getAge()
{
	return age;
}
}
