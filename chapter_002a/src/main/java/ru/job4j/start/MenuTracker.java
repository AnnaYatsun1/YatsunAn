package ru.job4j.start;

/**
 * Created by Анна on 01.11.2017.
 */


public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];
    private int position =0;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    public void fillAction(){
        this.actions[position++]= this.new AddItem();
        this.actions[position++]= new MenuTracker.ShowItems();
        this.actions[position++]= new EditItem();
        this.actions[position++] = new DeleteItem();
        this.actions[position++] = new FindItemById();
        this.actions[position++] = new FindItemsByName();
   }

   public void addAction(UserAction action){
        this.actions[position++]= action;

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
            tracker.deleteById(id);


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
            tracker.findById(id);


        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find by Id");
        }
    }
    public class FindItemsByName implements UserAction{

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please entre the task name");
            tracker.findByName(name);

        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find by Name");
        }
    }
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