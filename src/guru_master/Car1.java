package guru_master;

public class Car1 {
private String name;
private int cost;
private String color;
private int highspeed;
Car1(String name, int cost, String color, int highspeed)
{
	this.name=name;
	this.cost=cost;
	this.color=color;
	this.highspeed=highspeed;
}
public String getName()
{
	return name;
}
public String getColor()
{
	return color;
}
public int getCost()
{
	return cost;
}
public int getHighspeed()
{
	return highspeed;
}
}
