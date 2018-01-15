package ru.job4j.generic;

public  class UserStore extends AbstractStore<User> implements Store<User>{

        //extends AbstractStore<User>  implements Store<User>  {

    public UserStore(SimpleArray<User> simpleArray) {
        super(simpleArray);
    }


}




