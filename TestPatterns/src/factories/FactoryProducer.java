package factories;

import enums.FactoryTypes;

public class FactoryProducer {

	public static AbstractFactory getFactory(FactoryTypes factoryType){
		switch (factoryType) {
			case ANIMAL_FACTORY:{
				return new AnimalFactory();
			}
			
			case INSECT_FACTORY:{
				return new InsectFactory();
			}
			default:
				return null;
			}
	}
}
