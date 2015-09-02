package factories;

import animals.Rat;
import enums.InsectTypes;
import enums.MamalTypes;
import intefaces.Insects;
import intefaces.Mamal;

public class AnimalFactory extends AbstractFactory{

	@Override
	public Mamal getMamal(MamalTypes mamalType) {
		switch (mamalType) {
		
			case RAT:{
				return new Rat();
			}
				
	
			default:{
				return null;
			}
		
		}
	}

	@Override
	public Insects getInsect(InsectTypes insectType) {
		//NOTHING TO DO
		return null;
	}

}
