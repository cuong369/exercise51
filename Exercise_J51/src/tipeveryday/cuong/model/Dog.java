package tipeveryday.cuong.model;

import tipeveryday.cuong.service.AbstractAnimal;

/**
 * @author CuongTV21
 *
 */
public class Dog extends AbstractAnimal {

	@Override
	public void move() {
		System.out.println("it run");
	}

	@Override
	public void eat() {
		System.out.println("it eat rice");
	}

	@Override
	public void sleep() {
		System.out.println("it open sleep on night");
	}

	public void bark() {
		System.out.println("it bark so big");
	}

	public void run() {
		System.out.println("it run by four leg");
	}

}
