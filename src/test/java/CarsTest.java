import model.Car;
import model.CarName;
import model.Cars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

    @Test
    @DisplayName("자동차들이 정상적으로 추가되는지 확인")
    public void carAddTest(){
        Car gamzaCar = new Car("gamza");
        Car riceCar = new Car("rice");
        Car appleCar = new Car("apple");

        Cars cars = new Cars(Arrays.asList(gamzaCar, riceCar, appleCar));

        assertThat(cars.getCars().containsAll(Arrays.asList(gamzaCar,riceCar,appleCar))).isTrue();
        assertThat(cars.getCars().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 이름 입력 테스트")
    public void carsNameInputTest(){
        List<String> carsNameString = Arrays.asList("gamza","rice", "apple");
        List<Car> carNamesCar = carsNameString.stream()
                .map(Car::new)
                .collect(Collectors.toList());

        Cars racingCars = new Cars(carNamesCar);

        assertThat(racingCars.getCarsName()).isEqualTo("[gamza, rice, apple]");

    }
}
