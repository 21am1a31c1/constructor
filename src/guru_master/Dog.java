package guru_master;

public class Dog {
private String name;
private String color;
private String breed;
private int age;
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setColor(String color)
{
	this.color=color;
}
public  String getColor()
{
	return color;
}
public void setBreed(String breed)
{
	this.breed=breed;
}
public  String getBreed()
{
	return breed;
}
public void setAge(int age)
{
	if(age>5)

this.age=age;

else {
	this.age=0;
}
}
public int getAge()
{
	return age;
}
}
