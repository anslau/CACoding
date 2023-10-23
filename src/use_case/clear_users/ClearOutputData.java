package use_case.clear_users;
import entity.User;
import java.util.List;

// TODO Complete me

public class ClearOutputData {
    private final List<User> users;

    public ClearOutputData(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers(){
        return users;
    }
}
