package proffe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Анна on 14.09.2017.
 */
public class Doctor extends Profession {
    public String heal(Person person){
        person.setHealth(person.getHealth()+(5+this.expisiance));
        this.expisiance++;
        return String.format("%s лечит %s", this.name, person.getName());
    }

}

