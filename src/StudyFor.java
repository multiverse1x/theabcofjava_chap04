public class StudyFor {
    public static void main(String[] args) {
        //for문 공부하기

        //괄호{}안의 내용을 10번 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("------");

        //증감식의 변화.
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("------");

        //조건식의 변화, 조건식을 주의깊게 보자
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("------");

        //초기화와 증감식을 더 놓을수있다. 콤마사용. 초기화식 타입이 같아야함.(밑에서의 i와 j가 모두 int)
        //for문의 초기화식에서 쓰인 변수는 for문 안에서만 사용가능하다.
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println("i=" + i + "," + "j=" + j);
        }

        //만약 변수를 for문 밖에서도 사용하고 싶다면 i를 먼저 선언후에 사용
        int i; // scope(범위). 변수의 scope라고 함 - 변수는 선언된 블록의 끝까지만 사용가능
        for (i = 1; i <= 10; i++) {    //int i=1을 위로 빼내버리면, 조건식 빼버릴수있음. true로 간주되어서 무한반복문이 됨. for(;;){} 가능
            System.out.println("i=" + i);
        }
        System.out.println(i);

        System.out.println("------");

        //for문을 이용해서 더하기.
        int sum = 0; //합계를 저장하기 위한 변수.
        for(int x=1; x<=5; x++){
            sum += x;
        }
        System.out.println(sum);

    }
}