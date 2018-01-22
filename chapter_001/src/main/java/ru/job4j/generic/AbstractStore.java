package ru.job4j.generic;


public abstract class AbstractStore<T extends Base> implements Store<T> {

    private SimpleArray<T> simpleArray;



    public AbstractStore(SimpleArray<T> simpleArray) {
        this.simpleArray = simpleArray;
    }

    //
    public void add(T model) {

        simpleArray.add(model);
    }

////
    public boolean replace(String id, T model) {
        for (int i = 0; i < simpleArray.objects.length; i++) {
            if (simpleArray.objects[i] != null && model.getId().equals(simpleArray.objects[i].getId())) {
                simpleArray.objects[i]=model;
                return true;

            }
        }
        return false;
    }


///
    public boolean delete(T id) {
        for (int i = 0; i <simpleArray.objects.length ; i++) {
            simpleArray.delete(id,i );
        }


        return true;

    }




    //
    public T findById(String id) {
        T resul = null;
        for (T task : simpleArray) {
            if (task != null && task.getId().equals(simpleArray.getIndex())) {
                resul = (T) task;
                break;
            }
        }
        return resul;
    }
}

