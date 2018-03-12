package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    ExecutorService service = Executors.newFixedThreadPool(4);

    public static void main(String args[]) throws InterruptedException {
       ThreadPool s = new ThreadPool();
        s.add();
        //create 10 worker threads in Thread Pool


    }

    public void add() throws InterruptedException {
        while (this.service.isTerminated()) {
            wait();
            System.out.println("wait");
        }
        if (service.isTerminated()){
            System.out.println("[BlockingQueue] queue is full, notify");
            service.shutdown();
        }
        for (int i = 0; i < 10; i++) {
            service.submit(new Task(i)); //submit that to be done
        }
    }


    final class Task implements Runnable {
        private int taskId;

        public Task(int id) {
            this.taskId = id;
        }

        @Override
        public void run() {
            System.out.println("Task ID : " + this.taskId + " performed by "
                    + Thread.currentThread().getName());
        }

    }
}
