package VPJ_v2;

public class ConstrucktorTest {

    int i;


      private ConstrucktorTest() {}

     private   ConstrucktorTest(int number){

       this.i = number;

    }


    public static void main(String[] args) {


        ConstrucktorTest c1 = new ConstrucktorTest(7);

        System.out.println("number is = "+c1.i);


    }
}
