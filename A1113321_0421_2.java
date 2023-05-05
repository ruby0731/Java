import java.util.*;
public class A1113321_0421_2 {
    public static void main(String[] argv){
        Scanner sc =new Scanner(System.in);
        String day;
        boolean rf;
        do{
            rf=true;
            System.out.println("請輸入一個日期(xxxx/xx/xx或xx/xx/xxxx)：");
            day=sc.next();
            if(day.matches("[0-9][0-9][0-9][0-9]/[0-9][0-9]/[0-9][0-9]")){
                rf=true;
                System.out.println("你的日期是"+day);
            }
            else if(day.matches("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]")){
                rf=false;
                System.out.println("你的日期是"+day);
            }
            else{
                System.out.println("輸入錯了歐");
            }
        }while(rf=false);

    }    
}
