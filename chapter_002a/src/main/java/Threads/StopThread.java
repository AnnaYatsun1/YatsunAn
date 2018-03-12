package Threads;

import static java.lang.Thread.sleep;

public class StopThread {

    public static String haystack = "djflksdjf; sdlfkj sjdkl ksjflskd";
    public static int count = 0;
    public static int countFor = 0;


    public static class CountChar implements Runnable {
        public long startTime = System.currentTimeMillis();
        public long finishTime;
        public long timeSpent;

        @Override
        public void run() { for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == ' ') {
                countFor++;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                count++;
            }

        }

            System.out.println("символов " + count + " пробелов " + countFor);
            finishTime = System.currentTimeMillis();

        }
    }

    public static class Time implements Runnable {
        long times = 14;

        @Override
        public void run() {
            long times = 151921370;
            CountChar countChar = new CountChar();
            long timeSpent = countChar.startTime - countChar.finishTime;
            try {
                if(times<timeSpent){
                    System.out.println(timeSpent);
                    sleep(100);
                    System.out.println("метод спит");
                }
            }
            catch (InterruptedException e){
                System.out.println("Метод прерван");
            }
        }
    }
    public static void main(String[] args) {
        Thread first =new Thread(new CountChar());
        Thread secont =new Thread(new Time());
        first.start();
        secont.start();
        try {
            sleep(1300);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        secont.interrupt();
        System.out.println("Called interrupt()");
    }


}
