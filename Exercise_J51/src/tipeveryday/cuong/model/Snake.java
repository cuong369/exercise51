package tipeveryday.cuong.model;

import tipeveryday.cuong.service.AbstractAnimal;

/**
 * @author CuongTV21
 *
 */
public class Snake extends AbstractAnimal {

	@Override
	public void move() {
		System.out.println("it use body to run");
	}

	@Override
	public void eat() {
		System.out.println("it eat chuot");
	}

	@Override
	public void sleep() {
		System.out.println("it don't sleep");
	}
	
	public void crawl() {
		System.out.println("it crawl fastest");
	}

}
