package ru.job4j.collectiosss;

import java.util.*;

public class User {
    public int id;

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    String name;
    String adress;



    public int getId() {
        return id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }



    public String getKey() {
        return "Key-" + id;
    }

    @Override
    public String toString() {
        return "User{" +
                " Ures id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public class UserConvert {
        HashMap<Integer, User> process(List<User> list) {
            list = Arrays.asList(new User(1, "Vasay"), new User(2, "Sergey"), new User(3, "Kiril"));
            Map<Integer, User> map = new HashMap<>();
            list.forEach(e -> map.put(e.getId(), e));
            return (HashMap<Integer, User>) map;
        }
    }


}

