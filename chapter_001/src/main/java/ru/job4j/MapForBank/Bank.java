package ru.job4j.MapForBank;

import java.util.*;

public class Bank {
    Map<User, List<Account>> mapList = new HashMap<>();
    List<User> users = new LinkedList<User>();


    public void addUser(User user, ArrayList<Account> accountsList ) {

        mapList.put(user, accountsList);

    }

    public void deleteUser(User user) {
        mapList.remove(user);
    }

    public void addAccountToUser(User user, Account account) {
           mapList.get(user).add(account);

    }


    public void deleteAccountFromUser(User user, Account account) {
       mapList.get(user).remove(account);
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