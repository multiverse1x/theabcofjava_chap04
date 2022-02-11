import java.util.Scanner;

public class StudyWhile2 {
    public static void main(String[] args) {

        //각 자리수의 수를 더하기

        int num=0, sum=0;
        System.out.println("숫자를 입력하세요. (ex : 123) >> ");

        //10으로 나머지 연산을 하면 마지막 자리를 얻는다.
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);


        while(num!=0){
            sum += num%10;
            System.out.printf("sum=%3d, num=%d%n", sum, num);

            num /=10;
        }

        System.out.println("각 자리수의 합 : " + sum);
    }
}
