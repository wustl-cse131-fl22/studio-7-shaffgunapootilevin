package studio7;

public class Die {
	private int n;
	
	public Die(int n) {//constructor
		this.n = n;
	}
	public int roll() {
		return (int) (Math.random()*(n-1))+1;
	}

	

	}


