import classes.ObjectModel;
import classes.ObjectsCache;

public class Main {

	public static void main(String[] args) {
		ObjectModel modelOne = ObjectsCache.getObject(1);
		modelOne.readObjectContents();
		
		ObjectModel modelTwo = ObjectsCache.getObject(2);
		modelTwo.readObjectContents();
		
		///Or///
		ObjectsCache.getObject(1).readObjectContents();
		ObjectsCache.getObject(2).readObjectContents();
	}
}
