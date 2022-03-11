package week3homework;

public class App {

		public static void main(String[] args) {
	double itemPrice1 = 5.78;
	double itemPrice2 = 4.50;
	double moneyInWallet1 = 100;
	double moneyInWallet2 = 100;
	double numOfFriends = 10;
	int age = 25;
	String firstName = "Logan";
	String lastName = "Northern";
	String middleInital = "C";

	double newAmountMoney1 = moneyInWallet1 - itemPrice1;
	double newAmountMoney2 = moneyInWallet2 - itemPrice2;
	System.out.println("I have exactly $" + (newAmountMoney1 + newAmountMoney2 ) + " in my wallet");
	double friendsPerYear = age / numOfFriends;
	System.out.println("I have made about " +  friendsPerYear  + " friends for each year I have been alive");
    String fullName = firstName + " " + middleInital + " " + lastName;
    System.out.println("My name is " + fullName);
   
    

		}

	
	}

