package view;

public class OutputView {
    private static final String NAME_LIMIT_MESSAGE = "이름은 5글자를 초과할 수 없습니다.";
    private static final String DUPLICATION_NAME_MESSAGE = "자동차 이름이 중복되었습니다.";
    private static final String RACING_START_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉽표(,)를 기준으로 구분).";
    private static final String ATTEMPT_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?.";
    private static final String REPLAY_COUNT_EXCEPTION_MESSAGE = "시도 횟수로 숫자를 입력하셔야 합니다.";
    private static final String GAME_RESULT_MESSAGE = "실행 결과";
    private static final String GAME_WINNER_MESSAGE = "가 최종 우승했습니다.";

    public static void printNameLimitMessage(){
        System.out.println(NAME_LIMIT_MESSAGE);
    }

    public static void printDuplicateNameMessage() {
        System.out.println(DUPLICATION_NAME_MESSAGE);
    }

    public static void racingStartMessage(){
        System.out.println(RACING_START_MESSAGE);
    }

    public static void attemptNumberMessage(){
        System.out.println(ATTEMPT_NUMBER_MESSAGE);
    }
    public static void replayCountExceptionMessage(){
        System.out.println(REPLAY_COUNT_EXCEPTION_MESSAGE);
    }

    public static void printGameResultMessage() {
        System.out.println(GAME_RESULT_MESSAGE);
    }

    public static void printGameWinnerMessage(String winner) {
        System.out.println(winner + GAME_WINNER_MESSAGE);
    }
}
