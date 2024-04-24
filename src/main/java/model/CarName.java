package model;

import validator.CarNameValidator;

public class CarName {

    private final String name;
    public CarName(String name){
        new CarNameValidator(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
