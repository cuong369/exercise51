package tipeveryday.cuong.main;

import tipeveryday.cuong.model.AnimalTrainer;
import tipeveryday.cuong.model.Bird;
import tipeveryday.cuong.model.Dog;
import tipeveryday.cuong.model.Fish;
import tipeveryday.cuong.model.Snake;

public class AnimalMagament {

	public static void main(String[] args) {
		AnimalTrainer trainer = new AnimalTrainer();
		Dog dog = new Dog();
		Bird bird = new Bird();
		Fish fish = new Fish();
		Snake snake = new Snake();
		
		trainer.teach(dog);
		trainer.teach(bird);
		trainer.teach(fish);
		trainer.teach(snake);
	}
}
