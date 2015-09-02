package factories;

import enums.InsectTypes;
import enums.MamalTypes;
import intefaces.Insects;
import intefaces.Mamal;

public abstract class AbstractFactory {
	public abstract Mamal getMamal(MamalTypes mamalType);
	public abstract Insects getInsect(InsectTypes insectType);
}
