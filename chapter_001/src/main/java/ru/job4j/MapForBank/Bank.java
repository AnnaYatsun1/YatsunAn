package ru.job4j.MapForBank;

import java.util.*;

public class Bank {
    Map<User, List<Account>> mapList;
    Scanner scanner = new Scanner(System.in);
    protected int summsDeneg;
    ArrayList<Account> accountsList;
    private User user;

    public void addUser(User user) {
        if (mapList == null) {
            accountsList= new ArrayList<>();
            mapList.put(user, accountsList);
        }

    }

    public void deleteUser(User user) {
        for (Map.Entry<User, List<Account>> entry : mapList.entrySet()) {
            if (entry.getValue().contains(user)) {// contains ищем есть ли у нас значение по ключу или по значению если нет нам вернет тру
                if (user.getPassport() != null && mapList.get(user.getPassport()).equals(user.getPassport())) {
                    entry.getValue().remove(user);
                    break;
                }
            }
        }
    }

    public void addAccountToUser(User user, Account account) {
        for (Map.Entry<User, List<Account>> entry : mapList.entrySet()) {
            user = entry.getKey();
            List<Account> valueList = entry.getValue();
            for (Account account1 : valueList) {
                valueList.add(account1);///
            }

        }


    }


    public void deleteAccountFromUser(User user, Account account) {
        for (Map.Entry<User, List<Account>> entry : mapList.entrySet()) {
            user = entry.getKey();
            List<Account> valueList = entry.getValue();
            for (Account account1 : valueList) {
                valueList.remove(account1);

            }

        }
    }

    public List<Account> getUserAccounts(User user) {
        List<Account> result = mapList.get(user);
        if (null == result) {
            result = new ArrayList<Account>();
            mapList.put(user, result);
        }
        return result;


    }


    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount, List<Account> valueList, List<Account> valueListdst) {

        valueList = mapList.get(srcUser);
        valueListdst = mapList.get(dstUser);
        double result;
        if (mapList.containsKey(dstUser) && mapList.containsKey(srcUser)) {
            if (srcAccount.getValue() >= amount) {
                result = srcAccount.getValue() - amount;
                srcAccount.setValue(result);
                result = dstAccount.getValue() + amount;
                dstAccount.setValue(result);
                valueListdst.add(dstAccount);
                mapList.put(dstUser, valueListdst);
                valueList.add(srcAccount);
                mapList.put(srcUser, valueList);
            }

        } else {
            return false;
        }

        return true;
    }

    public boolean chekAccount(User srcUser, Account srcAccount, User dstUser, Account dstAccount, List<Account> valueList, List<Account> valueListdst) {
        valueList = mapList.get(srcUser);
        valueListdst = mapList.get(dstUser);
        if (mapList.containsKey(srcUser) && mapList.containsValue(srcAccount)) {
            for (Map.Entry<User, List<Account>> entry : mapList.entrySet()) {
                mapList.getOrDefault(entry.getKey(), entry.getValue());


            }
        }
//        if (mapList.containsKey(dstUser) && mapList.containsValue(dstAccount)) {
//            valueListdst.add(dstAccount);
//            mapList.getOrDefault(srcUser, valueListdst);
//        }
        else {
            return false;
        }
        return true;

    }

}