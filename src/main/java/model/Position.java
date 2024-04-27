package model;

public class Position { // 포장된 값(값 객체)
    private static final int START_POSITION = 0;

    private int position;

    public Position(){
        this.position = START_POSITION;
    }

    public void goOneStep(int movementAmount){
        position += movementAmount;
    }

    public int getPosition() {
        return position;
    }
}
