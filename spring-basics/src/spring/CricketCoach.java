package spring;

public class CricketCoach implements coach{
	private fortuneService fsSet;
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFsSet(fortuneService fsSet) {
		this.fsSet = fsSet;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "cricket bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fsSet.getFortune();
	}

}
