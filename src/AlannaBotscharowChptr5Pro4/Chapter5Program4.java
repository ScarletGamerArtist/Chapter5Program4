package AlannaBotscharowChptr5Pro4;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 11/18
 * Hex to Binary
 */
public class Chapter5Program4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//Prompt user to enter a hex digit. 
			//1-9 or A-F
		
				System.out.println("Please enter a hex digit. (A number from 0 - 9 or a capital letter from A - F)" ); 
		
		//Get input
		
				char ch = input.nextLine().charAt(0);
		
		//if statements
			//Display
		
				if (ch == '0') {
					System.out.println("The binary value is 0000");
				}
				else if(ch == '1'){
					System.out.println("The binary value is 0001");
				}
				else if(ch == '2'){
					System.out.println("The binary value is 0010");
				}
				else if(ch == '3'){
					System.out.println("The binary value is 0011");
				}
				else if(ch == '4'){
					System.out.println("The binary value is 0100");
				}
				else if(ch == '5'){
					System.out.println("The binary value is 0101");
				}
				else if(ch == '6'){
					System.out.println("The binary value is 0110");
				}
				else if(ch == '7'){
					System.out.println("The binary value is 0111");
				}
				else if(ch == '8'){
					System.out.println("The binary value is 1000");
				}
				else if(ch == '9'){
					System.out.println("The binary value is 1001");
				}
				else if(ch == 'A'){
					System.out.println("The binary value is 1010");
				}
				else if(ch == 'B'){
					System.out.println("The binary value is 1011");
				}
				else if(ch == 'C'){
					System.out.println("The binary value is 1100");
				}
				else if(ch == 'D'){
					System.out.println("The binary value is 1101");
				}
				else if(ch == 'E'){
					System.out.println("The binary value is 1110");
				}
				else if(ch == 'F'){
					System.out.println("The binary value is 1111");
				}
				else {
					System.out.println("That was an invalid input.");
				}
		
		
		
		
		
		
	}
}
