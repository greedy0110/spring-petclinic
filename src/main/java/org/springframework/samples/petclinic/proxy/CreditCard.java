package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment {

	//WHAT: 일종의 프록시

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		if (amount > 100) {
			System.out.println(amount + " 신용 카드");
		} else {
			cash.pay(amount);
		}
	}
}
