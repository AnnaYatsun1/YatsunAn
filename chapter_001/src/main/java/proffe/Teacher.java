package proffe;

/**
 * Created by Анна on 14.09.2017.
 */
public class Teacher extends Profession {
 public String teach(Person person){
     person.setLevelOfEducation(person.getLevelOfEducation()+expisiance+1);
     this.expisiance+=2;
     return String.format("%s учит %s", this.name, person.getName() );


 }
}