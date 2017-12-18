package ru.job4j.collectiosss;


import java.util.*;


public class SortUser {

    public List<User> addToArray(List<User> list){
        list = new ArrayList<User>();
        list.add(new User(10, "Bobasasasas"));
        list.add(new User(15, "Sam"));
        list.add(new User(4, "Grek"));
        list.add(new User(25, "Grek11"));
        list.add(new User(8, "Grek112655454545"));
        return list;
    }
    Set<User> sort(List<User> list) {

        return new TreeSet(list);
    }


        public List<User> sortNameLength(List<User> list) {

        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getnameLeng.compareTo(o2.getnameLeng);

                

            }
        });
        System.out.println(list);
        return list;

    }


      public List<User> sortByAllFields(List<User> list) {

        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {

                if(o1.getName().compareTo(o2.getName())!=0){
                return o1.getName().compareTo(o2.getName());
            }
                else
                        return o1.age.compareTo(o2.age);
        }
        });
        System.out.println(list);
        return list;
    }





    public  static class User implements Comparable<User> {

        Integer age;



        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {


            return name;
        }
        Integer getnameLeng = getName().length();

        @Override
        public int compareTo( User o) {

            if (this.getAge() > o.getAge())
                return 1;
            if (this.getAge() < o.getAge())
                return -1;
            else
                return 0;
        }



    }
}




