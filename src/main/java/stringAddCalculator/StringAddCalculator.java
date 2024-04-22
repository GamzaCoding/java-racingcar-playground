package stringAddCalculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {
    private static final int ZERO = 0;
    private static final int ONE_NUMBER_LENGTH = 1;
    private static final int FIRST_GROUP = 1;
    private static final int SECOND_GROUP = 2;
    private static final String WORD_INPUT_EXCEPTION_MESSAGE = "문자는 입력할 수 없습니다.";
    private static final String NEGATIVE_INPUT_EXCEPTION_MESSAGE = "음수는 입력할 수 없습니다.";

    public static int splitAndSum(String text) {
        checkException(text);
        if(text == null){
            return ZERO;
        }
        if(text.isEmpty()){
            return ZERO;
        }
        return numbersAdd(separateWordsBasedOnSplits(text));
    }

    private static void checkException(String text) {
        if(hasWord(text)){
            throw new RuntimeException(WORD_INPUT_EXCEPTION_MESSAGE);
        }

        if(hasNegative(text)){
            throw new RuntimeException(NEGATIVE_INPUT_EXCEPTION_MESSAGE);
        }
    }

    private static boolean hasWord(String text) {
        if(text == null || text.equals("")){
            return false;
        }
        if(text.length() == ONE_NUMBER_LENGTH){
            return isWord(text);
        }
        return false;
    }
    
    private static boolean isWord(String text){
        try{
            int number = Integer.parseInt(text);
        } catch(NumberFormatException e){
            return true;
        }
        return false;
    }

    private static boolean hasNegative(String text) {
        if(text != null && text.length() == ONE_NUMBER_LENGTH){
            return Integer.parseInt(text) < ZERO;
        }
        if(text == null || text.isEmpty()){
            return false;
        }
        String[] numbers = separateWordsBasedOnSplits(text);
        return Arrays.stream(numbers).mapToInt(Integer::parseInt)
                .filter(number -> ZERO <= number)
                .count() != numbers.length;
    }

    private static String[] separateWordsBasedOnSplits(String text){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(m.find()){
            return m.group(SECOND_GROUP).split(m.group(FIRST_GROUP));
        }
        return text.split(",|:");
    }

    private static int numbersAdd(String[] numberArray){
        return Arrays.stream(numberArray)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
