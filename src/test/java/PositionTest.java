import model.car.Position;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PositionTest {
    @Test
    @DisplayName("포지션 객체비교 테스트")
    public void positionTest(){
        Position position = new Position();

        assertThat(position).isEqualTo(new Position());
    }
}
