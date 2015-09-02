package classes;

import java.util.ArrayList;

import interfaces.Appartment;
import interfaces.Building;

public class MainBuilding implements Building{

	@Override
	public String name() {
		return "MainBuilding";
	}

	@Override
	public ArrayList<Appartment> appartmentsList() {
		ArrayList<Appartment> appartmentList = new ArrayList<>();
		appartmentList.add(new AppartmentOne());
		appartmentList.add(new AppartmentTwo());
		appartmentList.add(new AppartmentThree());
		return appartmentList;
	}
}
