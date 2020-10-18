import java.util.List;
import java.util.ArrayList;

public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<Person>();

        for(Person person : persons){
            if(person.getGender().equals("MALE")){
                malePerson.add(person);
            }
        }
        return malePerson;
    }
}
