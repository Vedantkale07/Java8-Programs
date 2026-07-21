package functionaIinterface;

public class VehicalMain {

    public static void main(String[] args) {

        // lambda expression
      Vehical v1=  () -> System.out.println("car is start");
      v1.start();
      Vehical v2= () -> System.out.println("bike is start");
      v2.start();
    }
}
