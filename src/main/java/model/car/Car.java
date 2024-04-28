package model.car;

import model.moveStrategy.CarMoveStrategy;
import model.moveStrategy.MoveStrategy;

import java.util.Objects;

public class Car {
    private final CarName name;
    private final Position position;
    private final MoveStrategy moveStrategy;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
        moveStrategy = new CarMoveStrategy();
    }

    public void carMove(int moveFlagNumber){
        if(moveStrategy.isMovable(moveFlagNumber)){
            position.changPosition(moveStrategy.getMovementAmount());
        }
    }
    public String getName () {
        return name.getName();
    }
    public int getCarPosition(){
        return position.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
