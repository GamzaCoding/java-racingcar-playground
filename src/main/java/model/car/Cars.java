package model.car;

import model.RandomNumber;
import model.car.Car;
import validator.CarsValidator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars { // 일급 컬렉션 // 불변으로 만들자
    private final List<Car> cars;

    public Cars(List<Car> cars){
        new CarsValidator(cars);
        this.cars = cars;
    }
    public String findWinners() {
        Car highestPositionCar = findHighestPositionCar();

        List<Car> winners = cars.stream()
                .filter(car -> car.getCarPosition() == highestPositionCar.getCarPosition())
                .collect(Collectors.toList());

        return winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
    }
    private Car findHighestPositionCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getCarPosition))
                .get();
    }
    public void carsMove(RandomNumber randomNumber) {
        for (Car car : cars) {
            car.carMove(randomNumber.createRandomNumberZeroToNine());
        }
    }
    public int getSize(){
        return cars.size();
    }
    public List<Car> getCars() {
        return cars;
    }
    public String getCarName(int index){
        return cars.get(index).getName();
    }
    public int getCarPosition(int index){
        return cars.get(index).getCarPosition();
    }
    public String getCarsName(){
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.toList())
                .toString();
    }
}
