public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopw = new StopWatch();

        stopw.start();
        try {
            Thread.sleep(250);
        } catch (InterruptedException a) {
            a.printStackTrace();
        }
        stopw.stop();
        System.out.println("Прошедшее время в миллисекундах: " + stopw.getElapsedTime());
    }
}