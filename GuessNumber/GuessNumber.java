public class GuessNumber{
	//vars
	private int randomNumber, userGuess, totalGuesses;
	private String msg;
	//costructor
	public GuessNumber(){
		totalGuesses=1;
		randomNumber=(int)(Math.random()*100)+1;
	}
	//set
	public void setUserGuess(int userGuess){
		this.userGuess=userGuess;
	}
	//compute
	public void compareNumbers(){
		if(userGuess==randomNumber){
			msg="Congratulations, you guessed the number";
		}
		else if(userGuess>randomNumber){
			msg="Your number is too heigh";
			totalGuesses++;
		}
		else if(userGuess<randomNumber){
			msg="Your number is too low";
			totalGuesses++;
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
	public int getTotalGuesses(){
		return totalGuesses;
	}
}