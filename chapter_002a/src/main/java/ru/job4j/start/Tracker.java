package ru.job4j.start;

/**
 * Created by Анна on 26.09.2017.
 */
import java.util.ArrayList;
import java.util.Random;

public class Tracker {

    private Task[] tasks = new Task[10];
    public int position = 0;
    private static final Random RN = new Random();

    public Task add(Task task) {
        task.setId(this.generatedId());
        this.tasks[position] = task;
        return task;

    }
    public void edit(Task fresh){
        for (Task task : tasks){
            if(task != null && task.getId().equals(fresh.getId()));
            task =fresh;
            break;
        }
    }

    public Task findById(String id) {
        Task result = null;
        for (Task task : tasks) {

            if (task != null && task.getId().equals(id)) {
                result = task;
                break;
            }
        }
        return result;
    }

    String generatedId() {

        return String.valueOf(RN.nextInt());
    }

    public void update(Task task) {

        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId().equals(task.getId())) {
                tasks[i]= task;
                break;
            }
        }
    }

    public void delete(Task task) {
        Task result = null;
        for (Task task1 : tasks) {

            if (task != null && task.getId().equals(generatedId())) {
                result = null;
                break;
            }
        }
    }

    public Task[] findAll() {
        Task[] result = new Task[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.tasks[index];
        }
        return result;
    }

    public Task[] findByName(String key) {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getName().equals(key)) {
                result.add(task);
            }
        }
        return (Task[]) result.toArray();
    }


//    public Task [] getAll(){
//        Task result = new Task[this.position];
//    }
}

