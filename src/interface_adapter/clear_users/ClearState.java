package interface_adapter.clear_users;
import java.util.List;

// TODO Complete me

public class ClearState {
    private List<String> users = null;

    public ClearState(ClearState copy){
        users = copy.users;
    }

    public ClearState(){}

    public void setDeletedUsers(List<String> users){
        this.users = users;
    }

    public List<String> getUsers(){
        return users;
    }
}
