package VPJ_v2;

public class ConstrucktorTest {

    int i;
    int x;
    String string;
      private ConstrucktorTest() {}

     private   ConstrucktorTest(int number){

       this.i = number;
    }
       ConstrucktorTest(int number1, String s){

        this.i = number1;
        this.string = s;
    }


    public static void main(String[] args) {

        ConstrucktorTest c1 = new ConstrucktorTest(8,"seven");
        ConstrucktorTest c2 = new ConstrucktorTest(6);
        ConstrucktorTest c3 = new ConstrucktorTest();

        System.out.println("Number in object one is = "+c1.i+" and "+c1.string);
        System.out.println("Number in object two is = "+c2.i);
    }
}
