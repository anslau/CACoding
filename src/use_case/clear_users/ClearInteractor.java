package use_case.clear_users;
import java.util.List;
import entity.User;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        List<User> users = userDataAccessObject.clearUsers();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
