package finalwork.presenter;

import finalwork.model.Model;
import finalwork.ui.View;

public class Presenter {
    private Model model;
    
    public Presenter(View view, Model model){
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }

    public String acceptСalculation(String str){
        String result = model.start(str);
        return result;
    }
}