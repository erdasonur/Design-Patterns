import java.util.List;
import java.util.ArrayList;

public class PrototypePattern {
    public static void main(String[] args){
        Member member = new Member();
        member.addMember("Ali");
        member.addMember("Ahmet");
        member.addMember("Veli");
        Member member2 = (Member) member.clone();
        Member member3 = (Member) member.clone();

        List<String> list1 = member2.getMemberList();
        list1.add("Ayşe");

        List<String> list2 = member3.getMemberList();
        list2.remove("Ahmet");

        System.out.println("Member List: " + member.getMemberList());
        System.out.println("Member2 List: " + list1);
        System.out.println("Member3 List: " + list2);

    }
}
