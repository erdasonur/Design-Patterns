import java.util.List;
import java.util.ArrayList;

public class Member implements Cloneable{
    private List<String> memberList;
    public Member(){
        memberList = new ArrayList<String>();
    }
    public Member(List<String> memberList){
        this.memberList = memberList;
    }
    public void addMember(String member){
        memberList.add(member);
    }
    public List<String> getMemberList(){
        return memberList;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        List<String> memberList = new ArrayList<String>();
        for (String s : this.getMemberList()) {
            memberList.add(s);
        }
        return new Member(memberList);
    }
}
