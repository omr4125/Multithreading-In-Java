package thread_priority;

public class Main {
    public static void main(String[] args) {

        System.out.println("Number of processor: " + Runtime.getRuntime().availableProcessors());

        MyThread[] threads = new MyThread[30];

        for (int i = 0; i < threads.length; i++)
            threads[i] = new MyThread();

        threads[0].setPriority(Thread.MAX_PRIORITY);
        threads[1].setPriority(Thread.MAX_PRIORITY);
        threads[2].setPriority(Thread.MAX_PRIORITY);
        threads[3].setPriority(Thread.MAX_PRIORITY);
        threads[4].setPriority(Thread.MIN_PRIORITY);
        threads[5].setPriority(Thread.MIN_PRIORITY);
        threads[6].setPriority(Thread.MIN_PRIORITY);
        for (MyThread thread : threads) {
            thread.start();
        }
        for (MyThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted...");
            }
        }
    }
}
