package Threads;

import net.jcip.annotations.ThreadSafe;

import java.util.ArrayList;
import java.util.List;

@ThreadSafe
public class UserStorage {

    static double result;
    static List<User> userList = new ArrayList<>();

    public static synchronized void add(final User user) {
        userList.add(user);

    }

    public static synchronized boolean update(final User user) {

        return true;
    }

    public static synchronized boolean delete(User user) {
        userList.remove(user);
        return true;
    }

    public static synchronized void transfer(int fromId, int toId, int amountr) {
        User user = new User();
        User userTo = new User(fromId, amountr);
        User userFor = new User(toId, amountr);
        synchronized (userTo) {
            synchronized (userFor) {
                if (userList.contains(userTo.getId()) && userList.contains(userFor.getId())) {
                    result = userTo.getAmount() - amountr;
                    userTo.setAmount((int) result);
                    result = userFor.getAmount() + amountr;
                    userFor.setAmount((int) result);

                }
            }


        }

    }

    public static class User {
        private static int amount;
        private static int id;


        public int getId() {
            return id;
        }

        public synchronized void setId(int id) {
            this.id = id;
        }

        public int getAmount() {
            return amount;
        }

        public synchronized void setAmount(int amount) {
            this.amount = amount;
        }


        public User(int id, int amount) {
            this.id = id;
            this.amount = amount;
        }

        public User() {

        }


    }

    public static final class UserThred extends Thread {
        public final User user1;
        public final User user2;
        UserStorage userStorage;

        public UserThred(User user1, User user2) {
            this.user1 = user1;
            this.user2 = user2;
        }

        @Override
        public void run() {
            userStorage.delete(user1);

        }
    }
}