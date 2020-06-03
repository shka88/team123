
/**
 * Aquarium 입장료를 계산해주는 메소드를 포함한 Aquarium 클래스
 * 
 * @author (2020.06.03) 
 * @version (2014671038 김진수, 2018315030 이가영, 2018315053 테라오카 유이카 )
 */
public class Aquarium
{
    /**calculate 나이를 입력하면 해당 나이에 맞는 요금을 return 해준다.
     * @param age 나이를 입력값으로 전달받는다. 
     * @return 나이에 맞는 요금을 return 해준다.  
     */
    public int calculate(int age){
        int money = 0 ;
        if(age >= 16){
            money = 2000;
        }
        else if (age>=7){
            money = 900;
        }
        else if(age >= 4){
            money = 400;
        }
        else{
            money = 0;
        }
        
        return money; 
    }
}