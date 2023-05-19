import java.util.Random;
import java.util.Scanner;
class Customer implements Runnable {
    private static final Object lock = new Object();
    private static final int MIN_ORDER = 10;
    private static final int MAX_ORDER = 50;
    private static final String[] DUMPLING_TYPES = {"豬肉水餃", "牛肉水餃", "蔬菜水餃"};

    private static int dumplingsRemaining = 100;
    private static int customersServed = 0;

    private final int id;

    public Customer(int id) {
        this.id = id;
    }
        private int generateRandomOrder() {
            Random random = new Random();
            return random.nextInt(MAX_ORDER - MIN_ORDER + 1) + MIN_ORDER;
        }

        private String getRandomDumplingType() {
            Random random = new Random();
            int index = random.nextInt(DUMPLING_TYPES.length);
            return DUMPLING_TYPES[index];
        }

        public void run() {
            while (true) {
                synchronized (lock) {
                    if (customersServed >= id) {
                        break;
                    }
    
                    int orderSize = generateRandomOrder();
                    String dumplingType = getRandomDumplingType();
    
                    System.out.println("顧客 " + id + " 點了 " + orderSize + " 顆" + dumplingType);
    
                    if (dumplingsRemaining >= orderSize) {
                        dumplingsRemaining -= orderSize;
                        System.out.println("顧客 " + id + " 得到了他的餃子");
                    } else {
                        System.out.println("顧客 " + id + " 餃子已售完");
                        customersServed++;
                        break;
                    }
                }
    
                try {
                    Thread.sleep(3000); // 等待服務生的時間
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public class A1113321_0512_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("請輸入同時光顧的顧客數目：");
            int numCustomers = scanner.nextInt();
    
            Thread[] threads = new Thread[numCustomers];
            for (int i = 0; i < numCustomers; i++) {
                threads[i] = new Thread(new Customer(i + 1));
                threads[i].start();
            }
    
            for (int i = 0; i < numCustomers; i++) {
                try {
                    threads[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    
            System.out.println("模擬結束");
        }
    }
    

    