package ru.job4j.max;
//   aaa         a3
//           aabbbb      aab4
//           abbbccccc   ab3c5


import java.util.*;

public class Solution {
    public static void main(String[] args) {

            String str = "aabcccccda";
            String[] splittedString = str.split("");

            Map<String, Integer> counterMap = new HashMap<>();
            for (String letter : splittedString) {
                if(!letter.isEmpty()) {
                    Integer count = counterMap.get(letter);
                    if(count == null) {
                        count = 0;
                    }
                    counterMap.put(letter, ++count);

                }

            }

//
//            for(String letter : counterMap.keySet()) {
//                System.out.println(letter+""+counterMap.get(letter));
//            }
        }
    }