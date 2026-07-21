package functionaIinterface;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator c1=(a, b) ->  {
            int result= a+b;
            System.out.println("result:"+result);
            return result;
        };
        c1.calci(33,33);


    }
}
