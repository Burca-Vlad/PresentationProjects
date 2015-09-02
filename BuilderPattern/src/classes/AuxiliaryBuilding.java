package classes;

import java.util.ArrayList;

import interfaces.Appartment;
import interfaces.Building;

public class AuxiliaryBuilding implements Building{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Auxiliary Building";
	}

	@Override
	public ArrayList<Appartment> appartmentsList() {
		ArrayList<Appartment> appartmentList = new ArrayList<>();
		appartmentList.add(new AppartmentOne());
		appartmentList.add(new AppartmentTwo());
		return appartmentList;
	}
}
