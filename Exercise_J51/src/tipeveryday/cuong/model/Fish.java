package tipeveryday.cuong.model;

import tipeveryday.cuong.service.AbstractAnimal;

/**
 * @author CuongTV21
 *
 */
public class Fish extends AbstractAnimal {

	@Override
	public void move() {
		System.out.println("it swin under water");
	}

	@Override
	public void eat() {
		System.out.println("it eat other fish");
	}

	@Override
	public void sleep() {
		System.out.println("it eat on night");
	}
	
	public void swim() {
		System.out.println("it swim the fastest");
	}

}
