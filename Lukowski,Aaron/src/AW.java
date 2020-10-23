import java.util.Scanner;

public class AW {

	public static void main(String[] args) {
		Scanner fromKeyboard = new Scanner(System.in);
                
        System.out.print("What is your desired annual income?: ");
        double income = fromKeyboard.nextInt();
        fromKeyboard.nextLine();
        
        System.out.println(income);
	}

}
