public class GuessNumber{
	//vars
	private int randomNumber, userGuess, totalGuesses;
	private String msg;
	//costructor
	public GuessNumber(){
		totalGuesses=1;
		randomNumber=(int)(Math.random()*100)+1;
		//Print the random number for testing purposes
		System.out.println(randomNumber);
	}
	//set
	public void setUserGuess(int userGuess){
		this.userGuess=userGuess;
	}
	//compute
	public void compareNumbers(){
		if(userGuess==randomNumber){
			if(totalGuesses==1){
				msg="Congratulations, you guessed the number \nYou guessed the correct number the first time";
			}
			else if(totalGuesses>1){
				msg="Congratulations, you guessed the number \nYou guessed the correct number in "+totalGuesses+" tries";
			}
		}
		else if(userGuess>randomNumber){
			msg="Your number is too high";
			totalGuesses++;
		}
		else if(userGuess<randomNumber){
			msg="Your number is too low";
			totalGuesses++;
		}
	}
	//get
	public int getRandomNumber(){
		return randomNumber;
	}
	public String getMsg(){
		return msg;
	}
	public int getTotalGuesses(){
		return totalGuesses;
	}
}