import java.util.Scanner;

public class StudyDoWhile {
    public static void main(String[] args) {

        //do while문 공부하기
        //일단 한번은 먼저 입력받는다

        int input=0, answer=0;

        answer=(int)(Math.random()*100) + 1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("1과 100사이 정수를 입력하세요 >>");
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("더 작은 수로 다시 시도하세요");
            }else if (input < answer){
                System.out.println("더 큰 수로 다시 시도하세요.");
            }
        }while(input!=answer);

        System.out.println("정답입니다.");
    }
}
