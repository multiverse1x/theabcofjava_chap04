public class StudyNameBreak {
    public static void main(String[] args) {

        //이름붙인 반복문 벗어나기

        Loop1 : for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(j==5)
                    break Loop1;
                System.out.println(i+"x"+j+"="+(i*j));
            } //for문의 끝
            System.out.println();
        } //Loop1의 끝
    }
}
