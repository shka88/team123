import java.util.*;
/**
 * Aquarium 입장료를 계산해주는 메소드를 포함한 Aquarium 클래스
 * 
 * @author (2020.06.03) 
 * @version (2014671038 김진수, 2018315030 이가영, 2018315053 테라오카 유이카 )
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        Aquarium aqualium = new Aquarium();
        System.out.println(aqualium.calculate(age));
    }
}
