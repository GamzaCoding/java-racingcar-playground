import model.Car;
import model.CarName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car testCar;

    @BeforeEach
    void setUp(){
        this.testCar = new Car(new CarName("teCar"));
    }

    @Test
    @DisplayName("Car 이름 부여 테스트")
    public void makeCar(){
        assertThat(testCar.getName()).isEqualTo("teCar");
    }

    @Test
    @DisplayName("Car 이동 기능 테스트. 단, 4 이상인 경우만 이동")
    public void carMoveTest(){
        assertThat(testCar.getCarLocation()).isEqualTo(0);

        testCar.carMove(1);
        assertThat(testCar.getCarLocation()).isEqualTo(0);

        testCar.carMove(3);
        assertThat(testCar.getCarLocation()).isEqualTo(0);

        testCar.carMove(4);
        assertThat(testCar.getCarLocation()).isEqualTo(1);

        testCar.carMove(5);
        assertThat(testCar.getCarLocation()).isEqualTo(2);
    }
}
