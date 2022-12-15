package pairmatching.util;

import java.util.Arrays;
import java.util.List;

public class InputValidator {
    private final static String PAIR_MATCHING = "1";
    private final static String PAIR_MATCHING_INQUIRY = "2";
    private final static String INITIALIZATION = "3";
    private final static String QUIT = "Q";

    private final static String INVALID_COMMAND_ERROR_MESSAGE = "[ERROR] 1, 2, 3, Q로 입력해야 합니다.";

    public static void validateMenuCommand(String input) {
        List<String> menu = Arrays.asList(PAIR_MATCHING, PAIR_MATCHING_INQUIRY, INITIALIZATION, QUIT);
        if (!menu.contains(input)) {
            throw new IllegalArgumentException(INVALID_COMMAND_ERROR_MESSAGE);
        }
    }
}
