package model;

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
    public List<Car> getCars() {
        return cars;
    }

    public String getCarName(int index){
        return cars.get(index).getName();
    }

    public int size(){
        return cars.size();
    }

    public int getCarPosition(int index){
        return cars.get(index).getCarPosition();
    }

    public String findWinner() {
        Car highestPositionCar = getHighestPositionCar();

        List<Car> winners = cars.stream()
                .filter(car -> car.getCarPosition() == highestPositionCar.getCarPosition())
                .collect(Collectors.toList());

        return winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
    }

    private Car getHighestPositionCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getCarPosition))
                .get();
    }

    public void carsMove() {
        for(int i = 0; i < cars.size(); i++){
            cars.get(i).carMove(RandomNumber.createRandomNumberZeroToNine()); // 랜덤값을 여기다 넣어 버리면 테스트 하기 어려운데
        }
    }

    public String getCarsName(){
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.toList())
                .toString();
    }
}
