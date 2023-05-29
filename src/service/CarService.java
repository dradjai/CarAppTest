package service;

import java.util.List;

import dao.DaoCar;
import model.Car;

public class CarService {

	DaoCar dao = new DaoCar();
	
	public void addCar(Car car) {
		dao.addCar(car);
	}
	
	public List<Car> getCars(){
		return dao.getCars();
	}
}
