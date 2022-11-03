package studio7;

public class HokeyPlayer {
	
	private String name;
	private int jersey;
	private String dominantHand;
	private String shootingHand;
	private int goals;
	private int assits;
	private boolean complete;
	private int games;
	
	public HokeyPlayer(String name, int jersey) {
		this.name = name;
		this.jersey = jersey;
	}
	
	public int points() {
		return goals +assits;
	}
	
	

	
	}


