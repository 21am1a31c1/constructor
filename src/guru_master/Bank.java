package guru_master;

public class Bank {
int getRateofinterest()
{
	return 0;
}
}
class HDFC extends Bank{
	@Override
	int getRateofinterest()
	{
		return 7;
	}
	}
class SBI extends Bank{
	@Override
	int getRateofinterest()
	{
		return 8;
	}
	}
class Axis extends Bank{
	@Override
	int getRateofinterest()
	{
		return 9;
	}
	}