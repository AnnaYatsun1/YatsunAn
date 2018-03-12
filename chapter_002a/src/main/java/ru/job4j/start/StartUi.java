package ru.job4j.start;


import com.sun.javafx.tk.Toolkit;
import com.sun.org.apache.bcel.internal.generic.Select;
import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.sound.midi.Track;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Анна on 10.10.2017.
 */
public class StartUi {
    //
    private Input input;
    private int[] ranges = new int[]{};
    private static final String ADD_NEW_ITEM = "0";
    private static final String Show_all_items = "1";
    private static final String Edit_item = "2";
    private static final String DeleteBy_Id = "3";
    private static final String Find_item_by_Id = "4";
    private static final String Find_items_by_name = "5";
    private static final String EXIT = "6";
    private static final String[] VARS = {ADD_NEW_ITEM, Show_all_items, Edit_item, DeleteBy_Id, Find_item_by_Id, Find_items_by_name, EXIT};


    public StartUi(Input input) {
        this.input = input;
    }

    public void init() {
        ConsoleInput consoleInput = new ValidateInput();
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        //menu.addAction();
//        menu.fillAction();
//        do {
//            menu.show();
//            int key = Integer.valueOf(input.ask("Select"));
//            menu.select(key);
//        } while (!"y".equals(this.input.ask("Exit y")));
//    }

        boolean isActive = true;
        System.out.println("Show menu");
        System.out.println("0. Add");
        System.out.println("1. Show all");
        System.out.println("2. Edit_item");
        System.out.println("3. DeleteBy_Id");
        System.out.println("4. Find_item_by_Id");
        System.out.println("5. Find_items_by_name");
        System.out.println("6. Exit");

        while (isActive) {
            System.out.println();
            String answer = consoleInput.ask("Select menu :", VARS);
            switch (answer) {
                case ADD_NEW_ITEM:
                    System.out.println("========= Добаваление новой заявки в Traker ========");
                    String name = consoleInput.askName("Ввдите ваше имя");
                    String desc = consoleInput.askName("Введите описания завки");
                    Task task = new Task(name, desc);
                    tracker.add(task);
                    System.out.println("========= Добавалена новая задача с id : " + task.getId());
                    break;
                case Show_all_items:
                    Task[] tasks = tracker.findAll();
                    for (Task value : tasks) {
                        if (value != null) {
                            System.out.println(value.getId() + " " + value.getName() + " " + value.getDesc());
                        }
                    }
                    break;
                case Edit_item:
                    System.out.println("========= Редактирование  завки ========");
                    String idEdit = consoleInput.askId("Веедите ваш ID завки");
                    String nameEdit = consoleInput.askName("Ввдите ваше имя");
                    String descEdit = consoleInput.askName("Введите описания завки");
                    Task taskEdit = new Task(nameEdit, descEdit);
                    taskEdit.setId(idEdit);
                    tracker.update(taskEdit);
                    System.out.println("========= Добавалена новая задача с id : " + taskEdit.getName() + " " + taskEdit.getDesc() + taskEdit.getId());
                    break;
                case DeleteBy_Id:
                    System.out.println("===========Удаление заявки==============");
                    String idTask = consoleInput.askId("Веедите  ID заявки которую вы хлотиде удалить");
                    tracker.deleteById(idTask);
                    break;

                case Find_item_by_Id:
                    System.out.println("========= Найти заявку по id ========");
                    String id = consoleInput.askId("Веедите ваш ID");
                    Task result = tracker.findById(id);
                    System.out.println("========Заявка по id " + result);
                    break;

                case Find_items_by_name:
                    System.out.println("========= Найти заявку по имени ========");
                    String nameInTrake = consoleInput.askName("Введите ваше имя");
                    Task results = tracker.findByName(nameInTrake);
                    System.out.println(results);
                    break;

                case EXIT:
                    isActive = false;
                    break;
            }
        }
    }


//}


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUi(input).init();

    }

}