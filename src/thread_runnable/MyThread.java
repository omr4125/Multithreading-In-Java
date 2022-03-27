package thread_runnable;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + "  is starting...");
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(400);
                System.out.println("In " + getName() + " count is: " + i);
            } catch (InterruptedException e) {
                System.out.println(getName() + " is interrupt");
            }
        }
        System.out.println(getName() + " is terminating");
    }
}
