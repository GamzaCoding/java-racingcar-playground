package model.car;

import java.util.Objects;

public class Position { // 포장된 값
    private static final int START_POSITION = 0;
    private int position;

    public Position(){
        this.position = START_POSITION;
    }

    public void changPosition(int movementAmount){
        position += movementAmount;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
