package validator;

import model.Car;
import view.ExceptionView;
import java.util.List;

public class CarsValidator {
    private static final int ONLY_ONE_CAR = 1;

    public CarsValidator(List<Car> cars){
        validateDuplicate(cars);
        validateOnlyOneCar(cars);
    }

    private void validateOnlyOneCar(List<Car> cars) {
        if(cars.size() == ONLY_ONE_CAR){
            throw new IllegalArgumentException(ExceptionView.getOnlyOneCarExceptionMessage());
        }
    }

    private void validateDuplicate(List<Car> cars) {
        if(isDuplication(cars)){
            throw new IllegalArgumentException(ExceptionView.getDuplicateNameExceptionMessage());
        }
    }
    private static boolean isDuplication(List<Car> cars) {
        return cars.stream()
                .map(Car::getName)
                .distinct()
                .count() != cars.size();
    }
}
