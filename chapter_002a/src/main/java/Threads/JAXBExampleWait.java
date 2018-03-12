package Threads;

public class JAXBExampleWait {
    public static String haystack = "djflksdjf; sdlfkj sjdkl ksjflskd djsfj jhsdflkjs";
    public static int count = 0;
    public static int countFor = 0;

    public static class ThredFor implements Runnable {
        @Override
        public void run() {
            System.out.println("Поток начал работу:::" + Thread.currentThread().getName());


            if (haystack.length() != 0) {
                count++;

                for (int i = 0; i < haystack.length(); i++) {
                    if (haystack.charAt(i) == ' ') {
                        count++;
                    }
                }
            }

            System.out.println("Количество слов "+count);
            System.out.println("Поток отработал:::" + Thread.currentThread().getName());
        }
    }
    public static class ThredForChar implements Runnable {
        @Override
        public void run() {
            System.out.println("Поток начал работу:::" + Thread.currentThread().getName());
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == ' ') {
                    countFor++;
                } }
            System.out.println("Количество пробелов "+countFor);
            System.out.println("Поток отработал:::" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        System.out.println("Програма о вычислении количества  слов и пробелов в тексте");
        Thread t1 = new Thread(new ThredFor(), "t1");
        Thread t2 = new Thread(new ThredForChar(), "t2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Все потоки отработали, завершаем программу");

    }

}