package finalwork.ui;

import java.util.Scanner;

import finalwork.presenter.Presenter;

public class ConsoleUi implements View, Print{

    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUi(){
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        boolean play = true;
        while(play){
            String string = scan();
            if (string.equals("стоп")){
                play = false;
            }else{
                String result = presenter.acceptСalculation(string);
                print(result);
            }
        }
    }

    private String scan() {
        System.out.println("Чтобы выйти из программы напишите 'стоп'\n Введите пример");
        String result = scanner.nextLine();
        return result;
    }

    @Override
    public void print(String str) {
        if (str == null){
            System.out.println("Некоректная запись ");
        }else{
            System.out.println("Ответ: " + str);
        }
    }
}
