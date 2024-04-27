package model;

public interface MoveStrategy {

    boolean isMovable(int MoveFlagNumber);

    int getMovementAmount();
}
