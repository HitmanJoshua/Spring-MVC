package com.hunter;


//@Bean
  public class AthleticsCoach implements Coach {

	//Dependency
	private WeatherService weatherService;
	private FortuneService fortuneService;
	private int gamesPlayed;
	private String firstName,secondName;
	


	
	
	
//	public AthleticsCoach(String firstName) {
//		super();
//		this.firstName = firstName;
//	}
//	
//	public AthleticsCoach(String secondName) {
//		super();
//		this.secondName = secondName;
//	}

	public AthleticsCoach(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
		System.out.println("constructor called");
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("setter called");
	}
	
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	@Override
	public String giveMyWorkout() {
		// TODO Auto-generated method stub
		return "Run  a  5k  Lap";
	}
	
	public String howsTheWeather()
	{
		return this.weatherService.getWeather();
	}

	@Override
	public String tellMyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.tellMyFortune();
	}
	@Override
	public String giveMyName() {
		// TODO Auto-generated method stub
		return this.firstName+this.secondName;
	}
	
	

	

}
