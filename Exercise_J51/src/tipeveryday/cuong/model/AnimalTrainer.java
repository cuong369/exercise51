package tipeveryday.cuong.model;

import tipeveryday.cuong.service.Animal;

public class AnimalTrainer {

	public void teach(Animal animal) {
		animal.move();
		animal.eat();
		animal.sleep();
	}
}
