package thread_synchronized;

public class SumArrayElements {
    int sum = 0;

    synchronized int sum(int[] array){
        for (int each : array) {
            sum += each;
            System.out.println("Sum : " + sum + " Thread name : " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        return sum;
    }
}
