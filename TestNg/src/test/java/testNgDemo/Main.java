package testNgDemo;

//class Ab{
//    int i=12;
//}
//
//class Cd extends Ab{
//    int i=10;
//}

public class Main {
    int i=10;
    public static void main(String[] args) {
        Main m = new Main();
        Main m2 = new Main();
        m.i=2;
        System.out.println(m.i);
        System.out.println(m2.i);


    }
}