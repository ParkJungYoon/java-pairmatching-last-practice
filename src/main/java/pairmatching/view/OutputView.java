package pairmatching.view;

import pairmatching.domain.Course;

import java.util.StringJoiner;

public class OutputView {
    private final static String SELECT_FEATURE_MESSAGE = "기능을 선택하세요.";
    private final static String MENU = "1. 페어 매칭\n" +
            "2. 페어 조회\n" +
            "3. 페어 초기화\n" +
            "Q. 종료";
    private final static String DIVIDING_LINE = "#############################################";
    private final static String COURSE = "과정: %s";

    public static void printSelectFeatureMessage() {
        System.out.println(SELECT_FEATURE_MESSAGE);
    }

    public static void printMenu() {
        System.out.println(MENU);
    }

    public static void printCourseLevelMission() {
        StringJoiner sj = new StringJoiner(" | ");
        for (Course course : Course.values()) {
            sj.add(course.getName());
        }
        System.out.println(DIVIDING_LINE);
        System.out.println(String.format(COURSE, sj.toString()));
        System.out.println(DIVIDING_LINE);
    }

    public static void printErrorMessage(String e) {
        System.out.println(e);
    }
}
