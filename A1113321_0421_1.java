import java.util.*;
public class A1113321_0421_1 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        String mail;
        boolean rf;
        do{
            rf=true;
            System.out.println("請輸入正確格式的學校電子郵件信箱：");
            mail=sc.next();
            if(mail.matches("a[01][0-9][0-9]33[0-9][0-9]@mail.nuk.edu.tw")){
                System.out.println("這個mail是對的");
            }
            else{
                System.out.println("這個mail格式錯了歐");
            }
        }
            while(rf=false);
        
        
    }
}
