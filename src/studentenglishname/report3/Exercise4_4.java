package studentenglishname.report3;


//4-4. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
//몇까지 더해야 총합이 100 이상이 되는지 구하세요.
public class Exercise4_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        for (int i = 1; true; i++, s = -s) {
            System.out.println("s:"+s+" i : "+i);
            num = s * i;
            System.out.println(num);
            sum += num;
            if (sum >= 100)
                break;
        }

        /*빈 칸*/

        System.out.println("num=" + num);
        System.out.println("sum=" + sum);
    }
}
