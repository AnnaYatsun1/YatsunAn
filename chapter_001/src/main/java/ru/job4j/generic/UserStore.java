package ru.job4j.generic;

public class UserStore extends SimpleArray<User>  implements Store {

    public UserStore(Object[] objects) {
        super(objects);
    }


    @Override
    public void add(Base model) {
        objects[index++] = model;
    }

    @Override
    public boolean replace(String id, Base model) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null && id.equals(model.getId())) ;
            objects[i] = model;
            break;
        }

////
        return true;
    }


    @Override
    public boolean delete(String id) {
        for (int i = 0; i <objects.length; i++) {
            if (objects[i] != null && id.equals(objects[i])) {
                objects[i] = null;
                break;
            }

        }
        return true;
    }

    @Override
    public Base findById(String id) {
        User resul = null;
        for (Object task : objects) {
            if (task != null && task.equals(id)) {
                resul = (User) task;
                break;
            }
        }
        return resul;
    }
}
