package ru.job4j.start;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Анна on 13.10.2017.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine() ;
    }
    public  String ask(String qustion, String[] range) throws MenuOutExeption  {
        String key =this.ask(qustion);
            boolean exist = false;
            for (String value : range){
                if(Objects.equals(value, key)){
                    exist = true;
                    break;
                }
        }
        if (exist){
            return key;
        }else {
          throw new MenuOutExeption("out of menu range");
          //  msg.printStackTrace();
        }
    }
    public String askName(String question) {
        System.out.print(question);
        return scanner.nextLine() ;
    }
    public String askId(String question) {
        System.out.print(question);
        return scanner.nextLine() ;
    }
}
