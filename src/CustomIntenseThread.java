public class CustomIntenseThread extends Thread{

    private long sleepTime;
    private long duration;

    public CustomIntenseThread(String name, long sleepTime,long duration) {
        super(name);
        this.sleepTime = sleepTime;
        this.duration = duration;
    }

    @Override
    public void run() {
        super.run();

        long startTime = System.currentTimeMillis();
        long now = 0;

        do{
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            now = System.currentTimeMillis();
        }while(now < startTime + duration);

    }
}
