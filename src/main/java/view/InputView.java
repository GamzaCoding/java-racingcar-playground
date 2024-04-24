package view;

import com.sun.source.doctree.ThrowsTree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static List<String> inputCarName(){
        Scanner scanner = new Scanner(System.in);
        return carNameList(scanner.nextLine());
    }
    private static List<String> carNameList(String inputCarName) {
        return Arrays.asList(inputCarName.split(","));
    }

    public static int inputPlayCount(){
        Scanner scanner = new Scanner(System.in);
        String playCount = scanner.nextLine();
        nonNumberInputExceptionCheck(playCount);

        return Integer.parseInt(playCount);
    }

    private static void nonNumberInputExceptionCheck(String playCount) {    // try-catch 구문에 throw new가 맞나??
        try {
            Integer.parseInt(playCount);
        } catch (Exception e){
            throw new IllegalArgumentException(ExceptionView.getReplayCountExceptionMessage());
        }
    }

}
