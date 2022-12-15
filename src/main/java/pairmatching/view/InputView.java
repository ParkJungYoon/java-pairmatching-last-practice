package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

import static pairmatching.util.InputValidator.*;

public class InputView {
    public static String readFeature() {
        OutputView.printSelectFeatureMessage();
        OutputView.printMenu();
        String command = Console.readLine();

        validateMenuCommand(command);
        return command;
    }
}
