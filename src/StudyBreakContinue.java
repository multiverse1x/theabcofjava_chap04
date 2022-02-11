import java.util.Scanner;

public class StudyBreakContinue {
    public static void main(String[] args) {

        //break문과 continue문의 쓰임임

       int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){ //무한 반복문
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("(4) exit");
            System.out.println("원하는 메뉴를 선택하세요.1~4 >>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==4){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if (!(1 <= menu && menu <= 3)){
                System.out.println("error : 메뉴를 잘못 선택 하셨습니다.");
                continue;
            }
            System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
            System.out.println();


        }

    }
}
