package finalwork.model;

public class Calculation {
    private Sum sum;
    private Difference difference;
    private Multiplication multiplication;
    private Division division;

    public Calculation(){
    	sum = new Sum();
        difference = new Difference();
        multiplication = new Multiplication();
        division = new Division();
    }

    public String calculation(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+'){
                String result = sum.sum(str);
                return result;
            }
            if (str.charAt(i) == '-'){
                String result = difference.minus(str);
                return result;
            }
            if (str.charAt(i) == '*'){
                String result = multiplication.multi(str);
                return result;
            }
            if (str.charAt(i) == '/'){
                String result = division.div(str);
                return result;
            }
        }
        return null;
    }
    
}
