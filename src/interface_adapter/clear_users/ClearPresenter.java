package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import java.util.List;
import entity.User;

public class ClearPresenter implements ClearOutputBoundary {
    private ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        ClearState clearState = clearViewModel.getState();
        List<User> users = clearOutputData.getUsers();

        List<String> names = null;
        for (User user: users){
            names.add(user.getName());
        }
        clearState.setDeletedUsers(names);

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }
}
