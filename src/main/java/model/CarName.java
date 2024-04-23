package model;

public class CarName { // 포장된 값(갑 객체)

    private final String name;

    public CarName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNameLength(){
        return name.length();
    }
}
