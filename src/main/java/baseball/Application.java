package baseball;

import static java.lang.Math.random;
import static java.lang.System.in;

import java.util.Scanner;

public class Application {

    static int[] score = new int[3];
    static int strike = 0, ball = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(in);

        for (int i = 0; i < score.length; i++) {
            int num = (int) (random() * 10);
            if (validateDuplicate(num)) {
                score[i] = num;
            }
        }

        // 배열 score에 난수 생성 완료
        String value = kb.nextLine();
        String[] values = value.split("");
        for (int i = 0; i < values.length; i++) {
            match(i, values[i]);
        }

        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return;
        }

        if (strike > 0) {
            System.out.printf("%d스트라이크 ", strike);
        }

        if (ball > 0) {
            System.out.printf("%d볼", ball);
        }
    }

    static void match(int idx, String value) {
        for (int i = 0; i < score.length; i++) {
            if (value.equals(score[i])) {
                if (idx == i) {
                    strike++;
                } else {
                    ball++;
                }
            }
        }
    }

    static boolean validateDuplicate(int num) {
        for (int i = 0; i < score.length; i++) {
            if (score[i] == num) {
                return false;
            }
        }
        return true;
    }
}
