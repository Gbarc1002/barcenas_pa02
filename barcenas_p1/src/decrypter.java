
public class decrypter {
	private int ddigit1;
	private int ddigit2;
	private int ddigit3;
	private int ddigit4;
	
	//Set each digit in the four digit number to it's corresponding spot
	public void setDecryptDigits(int realNum) {
		this.ddigit1 = realNum / 1000;
		realNum = realNum % 1000;
		this.ddigit2 = realNum / 100;
		realNum = realNum % 100;
		this.ddigit3 = realNum / 10;
		this.ddigit4 = realNum % 10;
	}

	public int getDDigit1() {
		return ddigit1;
	}
	
	public int getDDigit2() {
		return ddigit2;
	}
	
	public int getDDigit3() {
		return ddigit3;
	}
	
	public int getDDigit4() {
		return ddigit4;
	}
	
	public int change(int digit) {
		return (digit + 10 - 7) % 10;
	}

	public void displayDecryption(int dig1, int dig2, int dig3, int dig4) {
		System.out.printf("The Decrypted Number is: %d%d%d%d%n", 
				change(dig3), change(dig4), change(dig1), change(dig2));
	}
}
