package controller;

import java.util.List;

import model.Car;
import service.CarService;

public class CarController {

	public static void main(String[] args) {
		
		CarController controller = new CarController();
		
		Car carObj1 = new Car(1, "Toyota", "Camary", 25000.00);
		Car carObj2 = new Car(2, "Ford", "Mustang", 30000.00);
		controller.addCar(carObj1);
		controller.addCar(carObj2);
		System.out.println(controller.getCars());
		
		
	
		

	}
	

	CarService carServ = new CarService();
	
	public void addCar(Car car) {
		carServ.addCar(car);
	}
	
	public List<Car> getCars() {
		
		return carServ.getCars();
	}
	


}
