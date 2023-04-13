package finalwork;

import finalwork.model.Model;
import finalwork.presenter.Presenter;
import finalwork.ui.ConsoleUi;

import finalwork.ui.View;

public class Main{

    public static void main(String[] args) {
        View view = new ConsoleUi();
        Model model = new Model();
        
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
}