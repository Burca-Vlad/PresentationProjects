package classes;

import java.util.HashMap;

import model.VideoObject;

public class ObjectsCache {
	
	public static HashMap<Integer, ObjectModel> objectsMap = new HashMap<>();
	
	public static ObjectModel getObject(int id){
		//Never ever use this if you constantly update the map :)))
		if(objectsMap.isEmpty()){
			generateObjects();
		}
		ObjectModel model = objectsMap.get((Integer)id );
		return (ObjectModel) model.clone();
	}
	
	//Real life probably public
	private static void generateObjects(){
		VideoObject videoObject = new VideoObject();
		videoObject.setId(1);
		objectsMap.put((Integer) videoObject.getId(), videoObject);
		
		BrochureObject brochureObject = new BrochureObject();
		brochureObject.setId(2);
		objectsMap.put((Integer) brochureObject.getId(), brochureObject);
	}
}
