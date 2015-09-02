package factories;

import org.w3c.dom.views.AbstractView;

import animals.Rat;
import enums.InsectTypes;
import enums.MamalTypes;
import insects.Grasshopper;
import intefaces.Insect;
import intefaces.Mamal;

public class InsectFactory extends AbstractFactory{

	@Override
	public Mamal getMamal(MamalTypes mamalType) {
		//NOTHING TO DO
		return null;
	}

	@Override
	public Insect getInsect(InsectTypes insectType) {
		
		switch (insectType) {
			
			case GRASSHOPPER:{
				return new Grasshopper();
			}
			
			default:{
				return null;
			}
			
		}
	}

}
