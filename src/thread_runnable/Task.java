package thread_runnable;

public class Task implements Runnable{

    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + "  is starting...");
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(100);
                System.out.println("In " + taskName + " count is: " + i);
            } catch (InterruptedException e) {
                System.out.println(taskName + " is interrupt");
            }
        }
        System.out.println(taskName + " is terminating");
    }
}
