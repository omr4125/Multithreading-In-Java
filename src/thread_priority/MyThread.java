package thread_priority;

public class MyThread extends Thread{
    private int count = 0;
    public static boolean counting = true;
    private static final int maxCount = 100_000_000;

    @Override
    public void run() {
        System.out.println(this.getName() + " is starting");
        do{
            this.count++;
            if (this.count == maxCount){
                counting = false;
            }
        }while (counting && this.count < maxCount);
        System.out.println("In " + this.getName() + " count : " + count);
    }
}
