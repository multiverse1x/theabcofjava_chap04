public class StudyWhile {
    public static void main(String[] args) {

        //while문 공부하기

        int i = 5;
        while(i--!=0){
            System.out.println(i);
        }

        System.out.println("------");



        int sum = 0;
        i = 0;
        while (sum <= 100){
            System.out.printf("%d - %d%n",i, sum);
            sum += ++i;
        }


    }
}
