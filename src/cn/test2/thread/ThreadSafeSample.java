package cn.test2.thread;

public class ThreadSafeSample {
    public int sharedState;

    public void nonSafeAction() {
        while (sharedState < 100000) {
            synchronized (this) {
                int former = sharedState++;
                int latter = sharedState;
                if (former != latter - 1) {
                    System.out.printf("Observed data race, former is " +
                            former + ", " + "latter is " + latter);
                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeSample sample = new ThreadSafeSample();
        Thread threadA = new Thread() {
            @Override
            public void run() {
                sample.nonSafeAction();
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                sample.nonSafeAction();
            }
        };
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
    }
}
