
// User provides a 4 digit number and the program will print an encrypted 4 digit number right back
public class encrypter {
	//Instance variables for each digit given
	private int digit1;
	private int digit2;
	private int digit3;
	private int digit4;
	
	//Set each digit in the four digit number to it's corresponding spot
	public void setDigits(int realNum) {
		this.digit1 = realNum / 1000;
		realNum = realNum % 1000;
		this.digit2 = realNum / 100;
		realNum = realNum % 100;
		this.digit3 = realNum / 10;
		this.digit4 = realNum % 10;
	}
	
	public int getdigit1() {
		return digit1;
	}
	
	public int getdigit2() {
		return digit2;
	}
	
	public int getdigit3() {
		return digit3;
	}
	
	public int getdigit4() {
		return digit4;
	}
	//Adds 7 to a digit and takes the remainder of 10 before returning the integer
	public int convert(int digit) {
		return (digit + 7) % 10;
	}  
	
	//Switches the placement of the digits according to the encoder specifications and calls convert to change
	//the numbers accordingly
	public void printEncoded(int dig1, int dig2, int dig3, int dig4) {
		System.out.printf("The Encrypted Number is: %d%d%d%d%n", 
				convert(dig3), convert(dig4), convert(dig1), convert(dig2));
	}
}
