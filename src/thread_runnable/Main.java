package thread_runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is starting");

        Task task = new Task("+++++++");
        Thread thread = new Thread(task);

        thread.start();

        for (int i = 0; i < 100; i++){
            System.out.println("=========== MAIN ===============");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted...");
            }
        }
        System.out.println("Main thread is terminating...");
    }
}
