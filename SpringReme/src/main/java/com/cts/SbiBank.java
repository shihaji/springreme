package com.cts;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SbiBank implements Bank{
	
	int balance;
	
	public void doDeposit(int amount) {
		this.balance+=amount;
		System.out.println("Balance is "+this.balance);
	}
	
	public void doWithdraw(int amount) {
		
		this.balance-=amount;
		System.out.println("Balance is "+this.balance);
	}

}
