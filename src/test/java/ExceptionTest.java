import model.Car;
import model.CarName;
import model.Cars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ExceptionTest {

    @Test
    @DisplayName("자동차 이름 5글자 초과 예외 확인")
    public void overFiveName(){
        assertThatThrownBy(() -> new Car("aaabbb"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 이름 중복 예외 확인")
    public void duplicationCarName(){
        Car gamzaCar = new Car("gamza");
        Car riceCar = new Car("rice");
        Car appleCar = new Car("apple");
        Car appleCarDu = new Car("apple");

        assertThatThrownBy(() -> new Cars(Arrays.asList(gamzaCar, riceCar, appleCar, appleCarDu)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
