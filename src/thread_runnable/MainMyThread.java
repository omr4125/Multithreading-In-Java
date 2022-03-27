package thread_runnable;

public class MainMyThread {
    public static void main(String[] args) {

        System.out.println("Main thread is starting");

        MyThread myThread1 = new MyThread("child-thread-1");
        MyThread myThread2 = new MyThread("child-thread-2");
        MyThread myThread3 = new MyThread("child-thread-3");

        myThread1.start();
        myThread2.start();
        myThread3.start();

        /*for (int i = 0; i < 10; i++){
            System.out.println("==== MAIN ====");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted...");
            }
        }
        System.out.println("Main thread is terminating...");*/

        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted...");
        }
        System.out.println("Main thread is terminating...");
    }
}
