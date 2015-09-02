package classes;

import java.util.ArrayList;

import interfaces.Appartment;
import interfaces.Building;
import interfaces.Room;

public class BuildingBuilder {
	
	private ArrayList<Building> buildingsList = new ArrayList<>();
	
	public void createBlock(){
		buildingsList.add(new MainBuilding());
		buildingsList.add(new AuxiliaryBuilding());
		buildingsList.add(new AuxiliaryBuilding());
	}
	
	public void showBuildingsInfo(){
		for(Building building : buildingsList){
			System.out.println(building.name());
			showAvailableAppartments(building);
		}
	}
	
	private void showAvailableAppartments(Building building){
		System.out.println("Building " + building.name() + " has:");
		for(Appartment appartment : building.appartmentsList()){
			System.out.println("Appatrment: " + appartment.appartmentNumber());
			showListOfRooms(appartment);
		}
	}
	
	private void showListOfRooms(Appartment appartment){
		for(Room room : appartment.appartmentRooms()){
			System.out.println("This apartment has: " + room.roomType());
		}
	}
}
