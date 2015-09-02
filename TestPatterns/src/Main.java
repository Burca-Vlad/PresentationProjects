import enums.FactoryTypes;
import enums.InsectTypes;
import factories.AbstractFactory;
import factories.FactoryProducer;
import factories.InsectFactory;
import insects.Grasshopper;

public class Main {

	public static void main(String[] args) {
		InsectFactory insectFactory = (InsectFactory) FactoryProducer.getFactory(FactoryTypes.INSECT_FACTORY);
		
		Grasshopper grasshopper = (Grasshopper) insectFactory.getInsect(InsectTypes.GRASSHOPPER);
	}
}
