import java.util.ArrayList;
import java.util.List;

public class FilterPattern {
    public static void main(String[] args){
        List<Person> personList= new ArrayList<Person>();

        personList.add(new Person("ALİ", "MALE", "SİNGLE"));
        personList.add(new Person("AHMET","MALE","MARRİED"));
        personList.add(new Person("AYŞE", "FEMALE","SİNGLE"));
        personList.add(new Person("Fatma", "FEMALE","MARRİED"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singleorFemale = new OrCriteria(single,female);

        System.out.println("Male Persons : ");
        printPersonList(male.meetCriteria(personList));
        System.out.println("Female Persons : ");
        printPersonList(female.meetCriteria(personList));
        System.out.println("Single Persons : ");
        printPersonList(single.meetCriteria(personList));
        System.out.println("Single and Male Persons : ");
        printPersonList(singleMale.meetCriteria(personList));
        System.out.println("Single or Female Persons : ");
        printPersonList(singleorFemale.meetCriteria(personList));
    }
    public static void printPersonList(List<Person> personList){
        for(Person person : personList){
            System.out.println("Person : [ Name : " + person.getName() + " Gender : " + person.getGender() + " MarrialStatus : " + person.getMarialStatus() + " ]");
        }
    }
}
