package dao;

import java.util.ArrayList;
import java.util.List;

import model.Car;

public class DaoCar {
	
	
	List<Car> cars = new ArrayList<Car>();
	
	//adding a car
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	//get cars
	
	public List<Car> getCars() {
		return cars;
	}

}
