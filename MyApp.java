import java.util.*;
/**
 * 요금을 출력해주는 main 메소드를 포함한 MyApp클래스 
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
        Aquarium aquarium = new Aquarium();
        System.out.println("요금 : " + aquarium.calculate(age));
    }
}
