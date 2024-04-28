package model.moveStrategy;

public interface MoveStrategy {

    boolean isMovable(int MoveFlagNumber);

    int getMovementAmount();
}
