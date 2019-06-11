package spring;

public class trackCoach implements coach {
     private fortuneService fs;
	
	public trackCoach(fortuneService fortuneServ)
	{
		fs=fortuneServ;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "track run";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
