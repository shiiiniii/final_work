package finalwork.model;

import finalwork.presenter.Presenter;

public class Model {

    private Calculation calculation;

    public Model(){
    	calculation = new Calculation();  
    }

    public String start(String str){
        String result = calculation.calculation(str);
        return result; 
    }

    public void setPresenter(Presenter presenter){
    }

}