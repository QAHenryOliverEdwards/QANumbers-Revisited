package com.qa.main;

public class NumberLoop {
	
	String one = "one";
	String two = "two";
	String three = "three";
	String four = "four";
	String five = "five";
	String six = "six";
	String seven = "seven";
	String eight = "eight";
	String nine = "nine";
	String ten = "ten";
	String eleven = "eleven";
	String twelve = "twelve";
	String thirteen = "thirteen";
	String fourteen = "fourteen";
	String fifteen = "fifteen";
	String sixteen = "sixteen";
	String seventeen = "seventeen";
	String eighteen = "eighteen";
	String nineteen = "nineteen";
	String twenty = "twenty";
	String thirty = "thirty";
	String fourty = "fourty";
	String fifty = "fifty";
	String sixty = "sixty";
	String seventy = "seventy";
	String eighty = "eighty";
	String ninty = "ninety";
	String hundred = "hundred";
	
	public String translate(int number) {
		
		String returnStr = "";
		
		if (number == 1) {
			returnStr = one;
		}
		else if (number == 2) {
			returnStr = two;
		}
		else if (number == 3) {
			returnStr = three;
		}
		else if (number == 4) {
			returnStr = four;
		}
		else if (number == 5) {
			returnStr = five;
		}
		else if (number == 6) {
			returnStr = six;
		}
		else if (number == 7) {
			returnStr = seven;
		}
		else if (number == 8) {
			returnStr = eight;
		}
		else if (number == 9) {
			returnStr = nine;
		}
		else if (number == 10) {
			returnStr = ten;
		}
		else if (number == 11) {
			returnStr = eleven;
		}
		else if (number == 12) {
			returnStr = twelve;
		}
		else if (number == 13) {
			returnStr = thirteen;
		}
		else if (number == 14) {
			returnStr = fourteen;
		}
		else if (number == 15) {
			returnStr = fifteen;
		}
		else if (number == 16) {
			returnStr = sixteen;
		}
		else if (number == 17) {
			returnStr = seventeen;
		}
		else if (number == 18) {
			returnStr = eighteen;
		}
		else if (number == 19) {
			returnStr = nineteen;
		}
		
		else if (number >= 20){
			String resultStr = Integer.toString(number);
			if (resultStr.length() == 3) {
				returnStr = one + " " + hundred;
			}
			
			else {
				char firstChar = resultStr.charAt(0);
				char secondChar = resultStr.charAt(1);
				
				if (firstChar == '2') {
					returnStr += twenty + "-";
				}
				
				if (firstChar == '3') {
					returnStr += thirty + "-";
				}
				
				if (firstChar == '4') {
					returnStr += fourty + "-";
				}
				
				if (firstChar == '5') {
					returnStr += fifty + "-";
				}
				
				if (firstChar == '6') {
					returnStr += sixty + "-";
				}
				
				if (firstChar == '7') {
					returnStr += seventy + "-";
				}
				
				if (firstChar == '8') {
					returnStr += eighty + "-";
				}
				
				if (firstChar == '9') {
					returnStr += ninty + "-";
				}
				
				if (secondChar == '1') {
					returnStr += one;
				}
				
				if (secondChar == '2') {
					returnStr += two;
				}
				
				if (secondChar == '3') {
					returnStr += three;
				}
				
				if (secondChar == '4') {
					returnStr += four;
				}
				
				if (secondChar == '5') {
					returnStr += five;
				}
				
				if (secondChar == '6') {
					returnStr += six;
				}
				
				if (secondChar == '7') {
					returnStr += seven;
				}
				
				if (secondChar == '8') {
					returnStr += eight;
				}
				
				if (firstChar == '9') {
					returnStr += nine;
				}
			}
		}
		return returnStr;
	}
	
	public void printNumbers() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " = " + translate(i));
		}
	}
}
