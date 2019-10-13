package tipeveryday.cuong.model;

import tipeveryday.cuong.service.AbstractAnimal;

/**
 * @author CuongTV21
 *
 */
public class Bird extends AbstractAnimal {

	@Override
	public void move() {
		System.out.println("it fly");
	}

	@Override
	public void eat() {
		System.out.println("it eat rice, sâu");
	}

	@Override
	public void sleep() {
		System.out.println("it sleep on mid Night");
	}
	
	public void fly() {
		System.out.println("it fly on the mounts");
	}

}
