package thread_synchronized;

public class MyThread extends Thread{
    int[] array;
    static SumArrayElements sumArrayElements = new SumArrayElements();

    public MyThread(int[] array) {
        super();
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is starting");
        System.out.println("Sum of the array : " + sumArrayElements.sum(this.array));
        System.out.println(this.getName() + " is finished");
    }
}
