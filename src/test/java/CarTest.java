import model.car.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car testCar;

    @BeforeEach
    void setUp(){
        this.testCar = new Car("teCar");
    }

    @Test
    @DisplayName("Car 이름 부여 테스트")
    public void carNameTest(){
        assertThat(testCar.getName()).isEqualTo("teCar");
    }
    @Test
    @DisplayName("시작 Position 설정 테스트")
    public void carPositionTest(){
        assertThat(testCar.getCarPosition()).isEqualTo(0);
    }
    @Test
    @DisplayName("Car 이동 기능 테스트. 단, 4 이상인 경우만 이동")
    public void carMoveTest(){
        testCar.carMove(3);
        assertThat(testCar.getCarPosition()).isEqualTo(0);

        testCar.carMove(4);
        assertThat(testCar.getCarPosition()).isEqualTo(1);
    }
    @Test
    @DisplayName("Car 객체 동등성 비교")
    public void CarEquivalenceTest(){
        Car gamzaCar = new Car("gamza");

        assertThat(gamzaCar).isEqualTo(new Car("gamza"));
    }
}
