package ru.job4j.generic;

public class RoleStore extends SimpleArray<User>  implements Store {
    int index = 0;



    SimpleArray<Base> simpleArray;

    public RoleStore(Object[] objects) {
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


        return false;
    }

    @Override
    public boolean delete(String id) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null && id.equals(objects[i])) {
               objects[i] = null;
                return false;
            }

        }
        return true;
    }


    @Override
    public Base findById(String id) {
        Base resul = null;
        for (Object task : simpleArray.objects) {
            if (task != null && task.equals(id)) {
                resul = (Base) task;
                break;
            }
        }
        return resul;
    }
}

