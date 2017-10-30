package ru.job4j.start;

/**
 * Created by Анна on 10.10.2017.
 */
public class StartUi {


    private static final String ADD_NEW_ITEM = "0";
    private static final String Show_all_items = "1";
    private static final String Edit_item = "2";
    private static final String Delete_item = "3";
    private static final String Find_item_by_Id = "4";
    private static final String Find_items_by_name = "5";
    private static final String EXIT = "6";

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput();
        //String name = consoleInput.ask("Please enter the tasks");
        Tracker tracker = new Tracker();
        Item item = new Item();

        boolean isActive =true;

        while (isActive){
            switch (consoleInput.ask("Please enter the tasks")){
                case ADD_NEW_ITEM:
                    String askName = consoleInput.askName("Ввдите ваше имя");
                    tracker.add(item);
                    break;
                case Show_all_items:
                    tracker.findAll();
                    break;
                case Edit_item:
                    tracker.update(item);
                    break;
                case  Delete_item:
                    tracker.delete(item);
                    break;
                case   Find_item_by_Id:
                    String askId= consoleInput.askName("Ввдите ваше ID");
                    tracker.findById(askId);
                    break;
                case Find_items_by_name:
                    tracker.findByName("jhsdgf");
                    break;
                case   EXIT:
                    isActive=false;
                    break;

            }


        }
    }
}

