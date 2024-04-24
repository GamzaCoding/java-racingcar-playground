package validator;

import view.ExceptionView;
public class CarNameValidator {
    private static final int NAME_LENGTH_LIMIT = 5;

    public CarNameValidator(String name){
        validateNameLength(name);
        validateNameEmpty(name);
    }

    private void validateNameEmpty(String name) {
        if (name.isBlank()){
            throw new IllegalArgumentException(ExceptionView.getNameEmptyExceptionMessage());
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(ExceptionView.getNameLengthExceptionMessage());
        }
    }

}
