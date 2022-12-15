package pairmatching.controller;

import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.function.Supplier;

public class MenuController {
    private final static String PAIR_MATCHING = "1";
    private final static String PAIR_MATCHING_INQUIRY = "2";
    private final static String INITIALIZATION = "3";
    private final static String QUIT = "Q";

    public void run() {
        String menuCommand = initMenuCommand();

        while (!menuCommand.equals(QUIT)) {
            if (menuCommand.equals(PAIR_MATCHING)) {

            }
            if (menuCommand.equals(PAIR_MATCHING_INQUIRY)) {

            }
            if (menuCommand.equals(INITIALIZATION)) {

            }
        }
    }

    private String initMenuCommand() {
        String menuCommand = repeat(InputView::readFeature);
        return menuCommand;
    }

    private <T> T repeat(Supplier<T> inputReader) {
        try {
            return inputReader.get();
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            return repeat(inputReader);
        }
    }
}
