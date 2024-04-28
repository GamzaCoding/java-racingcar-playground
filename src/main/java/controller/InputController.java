package controller;

import model.car.Car;
import view.InputView;

import java.util.List;
import java.util.stream.Collectors;

public class InputController {

    public List<Car> getCarsName(){
        return mapToCarList(InputView.inputCarsName());
    }

    private static List<Car> mapToCarList(List<String> carNamesString) {
        return carNamesString.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public int getPlayCount(){
        return InputView.inputPlayCount();
    }
}
