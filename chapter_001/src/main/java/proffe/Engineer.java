package proffe;

/**
 * Created by Анна on 14.09.2017.
 */
public class Engineer extends Profession {
    public String giveExpirience(Person person){
        person.setLevelOfEducation(person.getLevelOfEducation()+expisiance+1);
        this.expisiance+=10;
        return String.format("%s передает опыт %s", this.name, person.getName() );


    }
}
