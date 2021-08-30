import javax.swing.JOptionPane;
public class GuessNumberApp{
	public static void main(String arg[]){
		//vars
		int randomNumber, userGuess, totalGuesses;
		String msg;
		//objects
		GuessNumber gn=new GuessNumber();
		do{

		//input
		userGuess=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number 1-100"));
		//set
		gn.setUserGuess(userGuess);
		//compute
		gn.compareNumbers();
		//get
		randomNumber=gn.getRandomNumber();
		msg=gn.getMsg();
		totalGuesses=gn.getTotalGuesses();
		//output
		JOptionPane.showMessageDialog(null, msg);

		}while (userGuess!=randomNumber);
	}
}