package ru.job4j.max;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {


            String str = "hhhnnvvvvuppp"; // h3nnv4up3
            char[] chars = str.toCharArray();

            Map<Character, Integer> result = new LinkedHashMap<>();
            for(Character c : chars){
                if(result.containsKey(c)){
                    result.put(c,result.get(c)+1);
                } else {
                    result.put(c, 1);
                }

                result.forEach((k,v)-> System.out.print(k.toString()+v));

            }
        }
    }

