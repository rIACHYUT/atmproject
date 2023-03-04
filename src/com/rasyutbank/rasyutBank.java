package com.rasyutbank;

public class rasyutBank {
	String name;
	String email;
	int accountnumber;
	int atmnumber;
	int pin;
	int ssn;
	int driverln;
	String address;
	int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getAtmnumber() {
		return atmnumber;
	}

	public void setAtmnumber(int atmnumber) {
		this.atmnumber = atmnumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getDriverln() {
		return driverln;
	}

	public void setDriverln(int driverln) {
		this.driverln = driverln;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean verifyuser(int[] cardno, int atm) {
		boolean flag = false;
		for (int cardn : cardno) {
			if (cardn == atm) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;

	}

	public boolean verifypin(int[] pin1, int pin, int cardno[], int atm) {
		int index = 0;
		boolean status = true;
		for (int i = 0; i < cardno.length; i++) {
			if (cardno[i] == atm) {
				index = i;
				break;
			}
		}
		int pin2 = pin1[index];
		if (pin2 == pin) {
			status = true;

		} else {
			status = false;

		}
		return status;

	}

	public String findnameindex(String[] name, int[] cardno, int atm) {
		int index = 0;
		for (int i = 0; i < cardno.length; i++) {
			if (cardno[i] == atm) {
				index = i;
			}
		}

		return name[index];
	}

	public int findbalance(int[] bal, int[] cardno, int atm) {
		int index = 0;
		for (int i = 0; i < cardno.length; i++) {
			if (cardno[i] == atm) {
				index = i;
			}
		}

		return bal[index];
	}
}
