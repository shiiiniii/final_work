package finalwork.ui;

import finalwork.presenter.Presenter;

public interface View {
    
    void setPresenter(Presenter presenter);
    void start();
}