public class StudyBreak {
    public static void main(String[] args) {

        //break문 공부하기
        int sum=0;
        int i =0;

        while(true){ //true 부분 생략불가
            if (sum>100)
                break; // 자신이 속한 하나의 반복문을 벗어난다.
            ++i;
            sum += i;

        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }
}
