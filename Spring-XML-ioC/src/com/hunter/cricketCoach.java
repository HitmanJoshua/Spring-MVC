package com.hunter;

public class cricketCoach implements Coach {

	private WeatherService weatherService;
	private FortuneService fortuneService;
	private int gamesPlayed;
	private String firstName,secondName;
	
	
	
	public cricketCoach() {
		super();
		System.out.println("Default constructor called....");
	}
	

//	public cricketCoach(String firstName) {
//		super();
//		this.firstName = firstName;
//	}
//
//	public cricketCoach(String secondName) {
//		super();
//		this.secondName = secondName;
//	}
	void init() {
		System.out.println("This is the init method....");
	}

	public cricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public cricketCoach(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
		return "Go Run Till u die";
	}
	
	public String howsTheWeather() {
		return this.weatherService.getWeather();
	}

	@Override
	public String tellMyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.tellMyFortune();
	}

	public String giveMyName() {
		// TODO Auto-generated method stub
		return this.firstName+this.secondName;
	}

	

}
