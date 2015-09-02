package factories;

import enums.InsectTypes;
import enums.MamalTypes;
import intefaces.Insect;
import intefaces.Mamal;

public abstract class AbstractFactory {
	public abstract Mamal getMamal(MamalTypes mamalType);
	public abstract Insect getInsect(InsectTypes insectType);
}
