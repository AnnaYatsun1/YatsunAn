package ru.job4j.MapForBank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Starts {
    private static final String ADD_NEW_User = "0";
    private static final String DELETE_User = "1";
    private static final String AddAccountToUser = "2";
    private static final String DeleteAccountFromUse = "=3";
    private static final String GetUserAccounts = "=4";

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput();
        Map<User, List<Account>> mapList = new HashMap<>();
        ArrayList<Account> accountsList = new ArrayList<>();
        Tasks tasks = new Tasks();

        boolean isActive = true;
        while (isActive) {
            String answer = consoleInput.ask("Select menu :");
            switch (answer) {
                case ADD_NEW_User:

                    System.out.println("========= Добаваление нового пользователя ========");
                    String name = consoleInput.ask("Введите имя");
                    String pasport = consoleInput.ask("Введите паспотрные данные");
                    User user = new User(name, pasport);
                    tasks.addUser(user);
                    mapList.put(user,accountsList );
                    //System.out.println("========= Добавалена новый пользователь : " + mapList);
                    break;
                case DELETE_User:

                    System.out.println("===========Удаление пользователя==============");
                    String passport1 = consoleInput.ask("Введите паспотрные данные");
                     for (Map.Entry<User, List<Account>> entry : mapList.entrySet()) {
                         user = entry.getKey();
                         user.setPassport(passport1);
                         entry.getValue().remove(user.getPassport());
                     }
                    break;
                case AddAccountToUser:
                    break;
                case DeleteAccountFromUse:
                    break;
                case GetUserAccounts:
                    break;
            }
        }
    }
}