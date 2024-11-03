package Model;
import java.util.List;

public class Family {
    private List<FL> members;
    private String family_id;

    public Family(List<FL> members, String family_id){
        this.members = members;
        this.family_id = family_id;
    }

    public List<FL> getMembers() {
        return members;
    }

    public void setMembers(List<FL> members) {
        this.members = members;
    }

    public String getFamily_id() {
        return family_id;
    }

    public void setFamily_id(String family_id) {
        this.family_id = family_id;
    }
}
