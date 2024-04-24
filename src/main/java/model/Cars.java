package model;

import validator.CarsValidator;
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

    public Car getCar(int index){
        return cars.get(index);
    }

    public String getCarName(int index){
        return cars.get(index).getName();
    }

    public int size(){
        return cars.size();
    }

    public String getCarsName(){ ////////////////////////// 임시
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.toList())
                .toString();
    }
}
