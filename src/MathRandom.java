public class MathRandom {
    public static void main(String[] args) {

        //Math.random 공부하기

        int num = 0;

        //괄호{} 안의 내용을  20번 반복한다.
        for (int i=1; i <=20; i++){
            System.out.println(Math.random());// 0.0 <= x <1.0
            System.out.println(Math.random()*10); // 0.0 <= x <10.0
            System.out.println((Math.random()*10)+1); // 1.0 <= x < 11.0
            System.out.println((int)(Math.random()*10)+1); // 1 <= x < 11

            //-5 ~ 5 사이의 난수
            System.out.println((int)(Math.random()*11)-5); // 0.0<=x<11 에서 -5씩됨.
        }





    }
}
