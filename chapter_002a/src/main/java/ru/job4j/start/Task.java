package ru.job4j.start;

/**
 * Created by Анна on 26.09.2017.
 */

public class Task {


    private String id;
    public  String name,desc;
    public long created;
    public String[] comments;


    public Task(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public Task(String id, String name, String desc,  String[] comments){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.comments = comments;

    }


    public Task() {
    }

    public Task(String id, String name, String desc, long created, String[] comments) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comments = comments;
    }

    public String getId() {

        return this.id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDesc() {

        return desc;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public long getCreated() {

        return created;
    }

    public void setCreated(long created)
    {
        this.created = created;
    }

    public String[] getComments()
    {
        return comments;
    }

    public void setComments(String[] comments)
    {
        this.comments = comments;
    }



}
