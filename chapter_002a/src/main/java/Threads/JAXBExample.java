package Threads;

public class JAXBExample {
    public static String haystack = "djflksdjf; sdlfkj sjdkl ksjflskd jkdfgh kkhdg df dkh f";
    public static int count = 0;
    public static int countFor = 0;

    public static final class Thre1 implements Runnable {
        @Override
        public void run() {

            if (haystack.length() != 0) {
                count++;
                for (int i = 0; i < haystack.length(); i++) {
                    if (haystack.charAt(i) == ' ') {
                        count++;
                    }
                }
                System.out.println("Количество слов "+count);
            }

        }
    }
    public static void main(String[] args) {
        Thread thread1=  new Thread(new Thre1());
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < haystack.length(); i++) {
                    if (haystack.charAt(i) == ' ') {
                        countFor++;
                    }

                }
                System.out.println("количество пробелов "+countFor);
            }
        }.start();
        thread1.start();



    }
}
