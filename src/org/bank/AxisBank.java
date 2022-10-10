package org.bank;

public class AxisBank extends BankInfo {
@Override
public void deposit() {
	System.out.println("10%");
}

@Override
	public void savings() {
		System.out.println("15%");
	}

@Override
	public void fixed() {
		System.out.println("5%");
	}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.deposit();
	a.savings();
	a.fixed();
	
	
}
}

