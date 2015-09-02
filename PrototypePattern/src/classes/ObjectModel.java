package classes;

public abstract class ObjectModel implements Cloneable{

	private int id;
	//Used protected instead of public to eliminate global visibility
	protected String name;
	protected String description;
	
	public abstract void readObjectContents();
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public Object clone(){
		 Object clone = null;
	      
	     try{
	    	 clone = super.clone();
	         
	     }catch(CloneNotSupportedException e) {
	         e.printStackTrace();
	     }
	     return clone;     
	}
}
