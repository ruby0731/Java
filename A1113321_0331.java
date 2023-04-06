import java.util.*;
public class A1113321_0331 {
    static void showInfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
    public static void main(String[] args){
        Scanner test = new Scanner(System.in);

        showInfo();
        animal a = new animal("雪寶", 1.1f, 52, 100);
        animal b = new animal("驢子", 1.5f, 99, 200);
        a.show();
        b.show();
        animal[] animals={a,b};
        for(int count=0 ; count<2 ; count++){
            System.out.println("請使用者輸入時間與加速度:");
            int num1 = test.nextInt();
            double num2 = test.nextDouble();
            if(num2<= 0){
                animals[count].distance(num1);
                System.out.println("距離:"+animals[count].distance(num1));
            }
            else{
                animals[count].distance(num1,num2);
                System.out.println("距離:"+animals[count].distance(num1,num2));
            }
        }

        human c = new human("阿克", 1.9f, 80, 150, "男");
        human d = new human("漢斯", 1.8f, 78, 130, "男");
        human e = new human("安那", 1.7f, 48, 120, "女");
        c.show();
        d.show();
        e.show();
        human[] humans={c,d,e};
        for(int count=0 ; count<3 ; count++){
            System.out.println("請使用者輸入時間與加速度:");
            int num1 = test.nextInt();
            double num2 = test.nextDouble();
            if(num2<= 0){
                humans[count].distance(num1);
                System.out.println("距離:"+humans[count].distance(num1));
            }
            else{
                humans[count].distance(num1,num2);
                System.out.println("距離:"+humans[count].distance(num1,num2));
            }
        }

        snow f = new snow("愛沙", 1.7f, 50, 120,"女", "Yes");
        f.show();
        snow[]snows={f};
        System.out.println("請使用者輸入時間與加速度:");
        int num1 = test.nextInt();
        double num2 = test.nextDouble();
        if(num2<= 0){
            snows[0].distance(num1);
            System.out.println("距離:"+snows[0].distance(num1));
        }
        else{
            snows[0].distance(num1,num2);
            System.out.println("距離:"+snows[0].distance(num1,num2));
        }
        }
    }


class animal{
    String name;
    float height;
    int weight;
    int speed;

    public animal(String name, float height, int weight, int speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }
    void show(){
        System.out.println("姓名:"+this.name+" 身高:"+this.height+" 體重:"+ this.weight+" 速度:"+this.speed);
    }
    int distance(int x){
        int move;
        move = x*this.speed;
        return move; 
    }
    double distance(int x, double y){
        double move;
        move = x*y*this.speed;
        return move;
    }
}

class human extends animal{
    String gender; 

    human(String name, float height, int weight, int speed,  String gender){
        super(name,height,weight,speed);
        this.gender=gender;
    }
    void show(){
        System.out.println("姓名:"+this.name+" 身高:"+this.height+" 體重:"+this.weight+" 速度:"+this.speed+" 性別:"+this.gender);
    }
}
class snow extends human{
    String snowskill;
    
    snow(String name, float height, int weight, int speed, String gender, String snowskill){
        super(name, height, weight, speed,  gender);
        this.snowskill=snowskill;
    }
    void show(){
        System.out.println("姓名:"+this.name+" 速度:"+this.speed+" 身高:"+this.height+" 體重:"+this.weight+" 性別:"+this.gender+" 冰雪技能:"+this.snowskill);
    }
    int distance(int x){
        int move;
        move = x*this.speed*2;
        return move; 
    }
    double distance(int x, double y){
        double move;
        move = x*y*this.speed*2;
        return move;
    }
}
