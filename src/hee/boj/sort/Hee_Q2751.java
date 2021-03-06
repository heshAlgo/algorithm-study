package hee.boj.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Hee_Q2751 {
    // N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
    // 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절대값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
    // 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int count = scanner.nextInt();
        if (count<1 || count>1000000){
            System.out.println("범위를 벗어난 입력값입니다.");
            return;
        }

        int num[] = new int[count];

        for(int i=0; i<count; i++){
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);
        for (int j=0; j<num.length; j++) {
            System.out.println(num[j]);
        }

    }
}

/* 
    doy feedback 
    저는 Collections.sort() 를 이용해 정렬했어요. ㅎㅎ
    배열이냐 컬렉션이냐 차이 같네요.
    그리고 대부분 알고리즘 문제는 범위 값에 해당하는 input을 입력하기 때문에 예외처리는 하지 않아도 상관 없을 것 같아요 :)
*/
