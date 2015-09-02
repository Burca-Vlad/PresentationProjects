import animals.Rat;
import enums.FactoryTypes;
import enums.InsectTypes;
import enums.MamalTypes;
import factories.AbstractFactory;
import factories.AnimalFactory;
import factories.FactoryProducer;
import factories.InsectFactory;
import insects.Grasshopper;
import intefaces.Insect;
import intefaces.Mamal;

public class Main {

	public static void main(String[] args) {
		
		//Method one
		//******************//
		InsectFactory insectFactory = (InsectFactory) FactoryProducer.getFactory(FactoryTypes.INSECT_FACTORY);
		
		Grasshopper grasshopper = (Grasshopper) insectFactory.getInsect(InsectTypes.GRASSHOPPER);
		grasshopper.hatches();
		grasshopper.eat();
		grasshopper.transform();
		grasshopper.die();
		
		AnimalFactory mamalFactory = (AnimalFactory) FactoryProducer.getFactory(FactoryTypes.MAMAl_FACTORY);
		Rat rat = (Rat) mamalFactory.getMamal(MamalTypes.RAT);
		rat.isBorn();
		rat.eat();
		rat.drink();
		rat.die();
		//******************//
		
		
		//Method two(no class cast)
		//******************//
		AbstractFactory abstractInsectFactory = FactoryProducer.getFactory(FactoryTypes.INSECT_FACTORY);
		
		Insect abstractGrasshopper = abstractInsectFactory.getInsect(InsectTypes.GRASSHOPPER);
		abstractGrasshopper.hatches();
		abstractGrasshopper.eat();
		abstractGrasshopper.transform();
		abstractGrasshopper.die();
		
		AbstractFactory abstractMamalFactory = FactoryProducer.getFactory(FactoryTypes.MAMAl_FACTORY);
		Mamal abstractRat = abstractMamalFactory.getMamal(MamalTypes.RAT);
		abstractRat.isBorn();
		abstractRat.eat();
		abstractRat.drink();
		abstractRat.die();
	}
}
