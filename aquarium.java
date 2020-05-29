
/**
 * aquarium 클래스 .
 * 
 * @author (2014671031 김진수,2018315030 이가영,2018315053 테라오카유이카) 
 * @version (2020.05.29)
 */
public class aquarium
{
    /**
     * 유아(4세미만) : 0원 
     * 어린이 4세이상 : 400원 
     * 7세 이상 : 900원 
     * 16세 이상 : 2000원 
     */
    public int a(int age)
    {
        int money = 0;
        if(age >= 16){
            money = 2000;     
        }
        else if(age >= 7){
            money = 900;
        }
        else if(age >= 4){
            money = 400;
        }
        else{
            return money;
        }
        return money;
    }
}