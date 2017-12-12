package ru.job4j.MapForBank;

import java.util.*;

public class Account {
    Scanner scanner = new Scanner(System.in);

    public Account(double value, int requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double value;
    public int requisites;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getRequisites() {
        return requisites;
    }

    public void setRequisites(int requisites) {
        this.requisites = requisites;
    }

    public ArrayList<Account> createlist() {
        ArrayList<Account> accountsList = new ArrayList<>();
        for (int i = 0; i < accountsList.size(); i++) {
            accountsList.add(i, new Account(this.value, this.requisites));

        }
        return accountsList;

    }

    public Map<User, List<Account>> createmapList(ArrayList<Account> accountsList, User user) {
        Map<User, List<Account>> mapList = new HashMap<>();
        for (int i = 0; i <mapList.size() ; i++) {
            mapList.put(new User(user.getName(), user.getPassport()), accountsList);

        }
        return mapList;

    }
    public void addUser(User user) {





    }


}



