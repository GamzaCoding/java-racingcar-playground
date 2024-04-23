package model;

import view.OutputView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Cars { // 일급 컬렉션 // 불변으로 만들자
    private final List<Car> cars;

    public Cars(List<Car> cars){
        validateDuplicate(cars);
        this.cars = cars;
    }
    private void validateDuplicate(List<Car> cars) {
        if(isDuplication(cars)){
            OutputView.printDuplicateNameMessage();
            throw new IllegalArgumentException();
        }
    }
    private static boolean isDuplication(List<Car> cars) {
        return cars.stream()
                .map(Car::getName)
                .distinct()
                .count() != cars.size();
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
