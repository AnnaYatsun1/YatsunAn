package ru.job4j.list;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    Read2 read2;


    //  String[] keys = (String[]) .entrySet().toArray();
    String b;
    String a;




    public MapExample(String b, String a) {
        this.b = b;
        this.a = a;
    }

    public  class Read2 {
        public  void main(String[] args) {
            Map<String, String> map=new HashMap<>();
            map.put("dfhkjs", "sdhkjfh");
            map.put("dfhk,sdkhfjs", "sdhkjfh");
            String[] keys = (String[]) map.entrySet().toArray();

        }
        boolean insert(String key, String value, Map map){

            return (boolean) map.put(value, key);


        }

        String get(String key, Map map){
            return (String) map.get(key);
        }
        boolean delete(String key,  Map map){

            return (boolean) map.remove(key);
        }
    }
}
