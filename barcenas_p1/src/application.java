import java.util.Scanner;

public class application {
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int option, number;
		
		encrypter code;
		code = new encrypter();
		
		decrypter decode;
		decode = new decrypter();
		
		//Lets the user decide what to do
		option = menu();
		while (option != 3) {
			System.out.println("Please input a number with 4 or less digits");
			number = sc.nextInt();
			
			//Ensures the number provided is at most 4 digits
			while (number > 9999 || number < 0) {
				System.out.println("Please input a valid number");
				number = sc.nextInt();
			}
			if (option == 1) {
				
				//used to encrypt the number given
				code.setDigits(number);
				code.printEncoded(code.getdigit1(), code.getdigit2(), code.getdigit3(), code.getdigit4());
			} else if (option == 2) {
			
				//Used to decrypt the number given
				decode.setDecryptDigits(number);
				decode.displayDecryption(
					decode.getDDigit1(), decode.getDDigit2(), decode.getDDigit3(), decode.getDDigit4());
			}
			
			//Give the user the option to repeat the process again if necessary
			option = menu();
		}
		
		System.out.println("Program Ended");
	}
	
	//Offers choices as to what the user wants to do and makes sure they input valid options
	public static int menu() {
		int choice;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) Encrypt a Number");
		System.out.println("2) Decrypt a Number");
		System.out.println("3) End Program");
		choice = scan.nextInt();
		while (choice < 1 || choice > 3) {
			System.out.println("Please input a valid option");
			choice = scan.nextInt();
		}
		return choice;
	}

}
