package thread_synchronized;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 23, 45, 9, 52, 78};

        MyThread myThread1 = new MyThread(array);
        MyThread myThread2 = new MyThread(array);

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread is finishing");
    }
}
