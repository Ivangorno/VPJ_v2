package VPJ_v2;

public class ConstrucktorTest {

    int age;

    String name;
      private ConstrucktorTest() {}

     private   ConstrucktorTest(int number){

       this.age = number;
    }
       ConstrucktorTest(int number1, String s){

        this.age = number1;
        this.name = s;
    }


    public static void main(String[] args) {

        ConstrucktorTest c1 = new ConstrucktorTest(88,"Bob");
        ConstrucktorTest c2 = new ConstrucktorTest(60);
        ConstrucktorTest c3 = new ConstrucktorTest();

        System.out.println("Object one is "+c1.name+" and he is "+c1.age+" years old");
        System.out.println("Object two is "+c2.age+" and unfortunately has no name");
    }
}
