package ru.job4j.generic;

public  abstract class RoleStore extends SimpleArray<Role>  implements Store<Role> {


    public RoleStore(Role[] objects) {
        super(objects);
    }

}

