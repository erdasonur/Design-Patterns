import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<Person>();

        for (Person person : persons){
            if(person.getMarialStatus().equals("SİNGLE")){
                singlePerson.add(person);
            }
        }
        return singlePerson;
    }
}
