package spring;

public class BaseballCoach implements coach{
	private fortuneService fs;
	
	public BaseballCoach(fortuneService fortuneServ)
	{
		fs=fortuneServ;
	}
	
	public String getDailyWorkout()
	{
		return"get daily workout 30 mins";
	}

	@Override
	public String getDailyFortune() {
		
		return fs.getFortune();
	}
	public void init()
	{
		System.out.println("init");
	}
	public void dest()
	{
		System.out.println("dest");
	}

}
