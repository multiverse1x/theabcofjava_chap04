public class StudyForInFor {
    public static void main(String[] args) {

        //중첩 for문 공부하기
        //구구단 만들어보기
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }

        System.out.println("-------------------");
        //별찍기 만들기
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("-------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
