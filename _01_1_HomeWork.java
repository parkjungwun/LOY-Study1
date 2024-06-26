package Java_Study;
/*덧셈 게임
임의의 두 자리 정수를 생성해서(랜덤 생성) 덧셈문제를 출제하고
사용자가 입력한 답과 정답이 맞으면 '맞았습니다'
틀리면 '틀렸습니다'로 출력하는 프로그램

<출력 1>
20 + 30 = 50  --> 50은 사용자가 입력
맞았습니다.

<출력 2>
15 + 30 = 40  --> 40은 사용자가 입력
틀렸습니다.
*/

import java.util.Scanner;
import java.util.Random;
public class _01_1_HomeWork {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

      int number1 = random.nextInt(100);
      int number2 = random.nextInt(100);

        System.out.println("다음 두 정수를 더하시오.");
        System.out.println(number1 + "+" + number2 + " = ?");

        System.out.println("답을 입력하시오.");
        int Answer = scanner.nextInt();

        if ((number1+number2) == Answer){
            System.out.println("맞았습니다.");
        } else {
            System.out.println("틀렸습니다.");
        }
    }
}
