package proffe;

/**
 * Created by Анна on 14.09.2017.
 */
public abstract class Person {
    protected String name;
    protected int age;
    protected int  levelOfEducation;
    protected int health = 100;

    public String getName(String s) {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(int levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }
}


