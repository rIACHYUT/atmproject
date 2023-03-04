package com.rasyutbank;

import java.util.Scanner;

public class RasyutAtm {
	public static void main(String[] args) {
		String[] name = { "harke", "Shyame", "thule", "kanxo", "gothalo" };
		String[] email = { "harkaman@gmail.com", "Shyamkumar@gmail.com", "thulbahadur@yahoo.com",
				"Kanxaram@outlook.com", "gothale@gmail.com" };
		int[] accno = { 1111, 2222, 3333, 4444, 5555, };
		int[] atmno = { 12345, 23456, 34567, 45678, 56789 };
		int[] pin = { 1234, 2345, 3456, 4567, 5678 };
		int[] ssn = { 1001, 2002, 3003, 4004, 5005 };
		int[] driverln = { 11111, 22222, 33333, 44444, 55555 };
		int[] balance = { 10, 20, 40, 50, 60 };
		String[] address = { "nagpur", "chautara", "deurali", "bhanjhang", "kanpur" };

		Scanner sc = new Scanner(System.in);

		System.out.println("welcome to rasyut bank");
		System.out.println("thanks for banking with us");

		System.out.println("please enter your cardno");
		int atm = sc.nextInt();

		rasyutBank rb = new rasyutBank();
		boolean flag = rb.verifyuser(atmno, atm);
		if (flag == true) {
			System.out.println("please enter your pin");
			int pin1 = sc.nextInt();
			boolean status = rb.verifypin(pin, pin1, atmno, atm);
			if (status == true)
				for (int j = 0; j < 5; j++) {
					String namee = rb.findnameindex(name, atmno, atm);
					System.out.println("welcome" + " " + namee);
					System.out.println(
							"please enter 1 to withdraw and 2 to deposite and 3 for balance induiry, 4 to change the pin, 5 to exit");
					int input = sc.nextInt();
					{
						if (input == 1) {
							System.out.println("enetr the amount you want to withdraw");
							int withdraw = sc.nextInt();
							int currbalance = rb.findbalance(balance, atmno, atm);
							if (withdraw > currbalance) {
								System.out.println("insufficent balance");
							} else {
								System.out.println("please take your money");
								System.out.println("your new balance is" + " " + (currbalance - withdraw));
								for (int k = 0; k < balance.length; k++) {
									if (pin[k] == pin1) {
										balance[k] -= withdraw;
									}
								}
							}

						} else if (input == 2) {
							System.out.println("enetr the amount you want to deposite");
							int deposite = sc.nextInt();
							int currbalance = rb.findbalance(balance, atmno, atm);

							System.out.println("your new balance is" + " " + (currbalance + deposite));
							for (int l = 0; l < balance.length; l++) {
								if (pin[l] == pin1) {
									balance[l] += deposite;
								}
							}
						} else if (input == 3) {

							int currbalance = rb.findbalance(balance, atmno, atm);

							System.out.println("your  balance is" + " " + currbalance);
						} else if (input == 4) {
							System.out.println("enter your current pin");
							int inputpin = sc.nextInt();
							if (inputpin == pin1) {
								System.out.println("please enter new pin");
								int firstentry = sc.nextInt();
								System.out.println("please confirm your pin");
								int confirmpin = sc.nextInt();
								if (confirmpin == firstentry) {
									System.out.println("congratulation");
									for (int i = 0; i < pin.length; i++) {
										if (pin[i] == pin1) {
											pin[i] = confirmpin;
										}
									}

								} else {
									System.out.println("different input");
								}
							} else {
								System.out.println("wrong password");
							}
						} else if (input == 5) {
							System.out.println("thanks for  banking withus");
							System.out.println("have a good day");

						} else {
							System.out.println("invalid input");
						}
					}
				}
			else {
				System.out.println("wrong password stupid");
			}
		} else {
			System.out.println("you dont belong here ");
		}

	}

}
