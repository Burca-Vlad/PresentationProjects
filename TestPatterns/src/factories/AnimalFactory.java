package factories;

import animals.Rat;
import enums.InsectTypes;
import enums.MamalTypes;
import intefaces.Insect;
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
	public Insect getInsect(InsectTypes insectType) {
		//NOTHING TO DO
		return null;
	}

}
