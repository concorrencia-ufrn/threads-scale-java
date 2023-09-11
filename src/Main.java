public class Main {
    public static void main(String[] args) {

        long duration, sleepTime, scale, rampupInterval, creationInterval;

        try {

            scale = Long.parseLong(args[0]);
            sleepTime = Long.parseLong(args[1]);
            duration = Long.parseLong(args[2]);
            rampupInterval = Long.parseLong(args[3]);

            creationInterval = rampupInterval / scale;

            System.out.println("Warming up...wait 10s");

            Thread.sleep(5000);

            System.out.println("Starting threads...");

            for (int i = 1; i <= scale; i++) {
                new CustomIntenseThread("T" + i, sleepTime, duration).start();

                Thread.sleep(creationInterval);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("All threads running!!!");

    }
}