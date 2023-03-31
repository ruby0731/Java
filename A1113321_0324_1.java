import java.util.*;

class animal{
    String name;
    float height;
    int weight;
    int speed;

    void show(){
        System.out.println("名字:"+name+ "身高:"+height+ "體重:"+weight+ "速度:"+speed);
    }
        int distance(int x){
        int move;
        move = x*this.speed;
        return move;
    }
    double distance(int x,double y){
        double move;
        move = x*y*this.speed;
        return move;
    }
}
    public class A1113321_0324_1{
        public static void main(String[] argv){
            Scanner sc = new Scanner(System.in);
            animal people1, people2, people3, people4;
            
            people1=new animal();
            people2=new animal();
            people3=new animal();
            people4=new animal();
            animal[] peoples={people1, people2, people3, people4};
            
            people1.name="雪寶";
            people1.height=1.1f;
            people1.weight=52;
            people1.speed=100;
            people1.show();

            people2.name="驢子";
            people2.height=1.5f;
            people2.weight=99;
            people2.speed=200;
            people2.show();

            people3.name="安那";
            people3.height=1.7f;
            people3.weight=48;
            people3.speed=120;
            people3.show();

            people4.name="愛沙";
            people4.height=1.7f;
            people4.weight=50;
            people4.speed=120;
            people4.show();

            for(int count=0 ; count<peoples.length ; count++){
                System.out.println("請使用者輸入時間與加速度：");
                int num1 = sc.nextInt();
                double num2 = sc.nextDouble();
                if(num2 <= 0){
                    peoples[count].distance(num1);
                    System.out.println("距離:"+peoples[count].distance(num1));
                } 
                else{
                    peoples[count].distance(num1,num2);
                    System.out.println("距離:"+peoples[count].distance(num1,num2));
                }
            }
        }    
           
          
    }
    