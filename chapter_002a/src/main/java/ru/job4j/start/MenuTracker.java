package ru.job4j.start;

/**
 * Created by Анна on 01.11.2017.
 */


public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[5];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    public void fillAction(){
        this.actions[0]= this.new AddItem();
        this.actions[1]= new MenuTracker.ShowItems();
        this.actions[2]= new EditItem();
      //  this.actions[3] = new DeleteItem();
       // this.actions[4] = new FindItemById();
     //   this.actions[5] = new FindItemsByName();


    }
    public void select(int key){
        this.actions[key].execute(this.input, this.tracker);
    }
    public void show(){
        for (UserAction action: this.actions){
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    private  class AddItem implements UserAction{

        //@Override
        public int key() {

            return 0;
        }

       // @Override
        public void execute(Input input, Tracker tracker) {
            String name =input.ask("Please entre the  task name");
            String desc =input.ask("Please entre the  task desc");
            tracker.add(new Task(name, "first desc"));

        }

        //@Override
        public String info() {

            return String.format("%s. %s", this.key(), "Add the new item");
        }
    }
    private static class ShowItems implements UserAction{

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
           for (Task task : tracker.findAll()){
               System.out.println(String.format("%s %s", task.getId(), task.getName()));

           }

        }

        @Override
        public String info() {

            return String.format("%s. %s", this.key(), "Show All Items");
        }
    }
    public class DeleteItem implements UserAction{


        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please entre he task id");
            Task   task = new Task();
            task.setId(id);
            tracker.delete(task);

        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete the Item");
        }
    }
    public class FindItemById implements UserAction{


        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please entre he task name");
            Task   task = new Task();
            task.setId(id);
            tracker.findById(id);


        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find by Id");
        }
    }
//    public class FindItemsByName implements UserAction{
//
//        @Override
//        public int key() {
//            return 5;
//        }
//
//        @Override
//        public void execute(Input input, Tracker tracker) {
//            String name = input.ask("Please entre he task name");
//           // Task   task = new Task();
//           // task.setName(name);
//            tracker.findByName(name);
//
//        }
//
//        @Override
//        public String info() {
//            return String.format("%s. %s", this.key(), "Find by Name");
//        }
//    }
}
class EditItem implements UserAction{
    public int key() {

        return 2;
    }

    // @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please entre he task id");
        String name =input.ask("Please entre the  task name");
        String desc =input.ask("Please entre the  task desc");
        Task   task = new Task(name, desc);
        task.setId(id);
        tracker.edit(task);

    }

    public  String info() {

        return String.format("%s. %s", this.key(), "Edit the new item");
    }

}