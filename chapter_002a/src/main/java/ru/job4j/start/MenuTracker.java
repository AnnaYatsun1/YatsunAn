package ru.job4j.start;

import com.sun.javafx.tk.Toolkit;
import com.sun.jmx.snmp.tasks.Task;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by Анна on 30.10.2017.
 */
public class MenuTracker {
//    private Input input;
//    private Tracker tracker;
//    private UserAction[] actions = new UserAction[5];
//
//    public MenuTracker(Input input, Tracker tracker) {
//        this.input = input;
//        this.tracker = tracker;
//    }
//    public void fillActions(){
//        this.actions[0] = new AddItem();
//        this.actions[1]= new ShowItem();
//
//    }
//    public void select(int key){
//        this.actions[key].execute(this.input, this.tracker);
//    }
//    public  void show(){
//        for (UserAction action : this.actions){
//            if (action !=null) {
//                System.out.println(action.info());
//            }
//        }
//    }
//    public class AddItem implements UserAction{
//
//
//        @Override
//        public int key() {
//            return 0;
//        }
//
//        @Override
//        public void execute(Input input, Tracker tracker) {
//            String name  = input.ask("Pleas entre the task name");
//            String desk  = input.ask("Pleas entre the task desk");
//           // tracker.add(new Task(name, desk));
//
//
//        }
//
//        @Override
//        public String info() {
//            return String.format("%s, %s", this.key(), "Add the new item");
//        }
//    }
//    public static class ShowItem implements UserAction{
//
//
//
//        public int key() {
//            return 1;
//        }
//
//
//        public void execute(Input input, Tracker tracker) {
//           for (Item item: tracker){
//               System.out.println(String.format("%s. %s", item.getId(), item.getName()));
//           }
//
//        }
//
//
//        public String info() {
//            return String.format("%s, %s", this.key(), "Show All  item");
//        }
//    }
}
