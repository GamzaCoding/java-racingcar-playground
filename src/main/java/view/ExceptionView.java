package view;

public class ExceptionView {
    private static final String NAME_LENGTH_LIMIT_MESSAGE = "이름은 5글자를 초과할 수 없습니다.";
    private static final String DUPLICATION_NAME_MESSAGE = "자동차 이름이 중복되었습니다.";
    private static final String NAME_EMPTY_MESSAGE = "공백으로 이름을 입력할 수 없습니다.";
    private static final String REPLAY_COUNT_EXCEPTION_MESSAGE = "시도 횟수로 숫자를 입력하셔야 합니다.";
    private static final String ONLY_ONE_CAR_EXCEPTION_MESSAGE = "적어도 2개 이상 차를 입력하셔야 합니다.";

    public static String getNameLengthExceptionMessage(){
        return NAME_LENGTH_LIMIT_MESSAGE;
    }

    public static String getDuplicateNameExceptionMessage() {
        return DUPLICATION_NAME_MESSAGE;
    }

    public static String getReplayCountExceptionMessage(){
        return REPLAY_COUNT_EXCEPTION_MESSAGE;
    }

    public static String getNameEmptyExceptionMessage() {
        return NAME_EMPTY_MESSAGE;
    }

    public static String getOnlyOneCarExceptionMessage() {
        return ONLY_ONE_CAR_EXCEPTION_MESSAGE;
    }
}
