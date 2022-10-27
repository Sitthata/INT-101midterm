package mainpack;
import obj.Pattaradanai.Obj057;
import util057.UtilPattaradanai;

public class Main057 {

    public static void main(String[] args) {
        testZ();

    }

    public static void testZ(){
        System.out.println(UtilPattaradanai.pattaradanai);

        System.out.println(UtilPattaradanai.compute057RightTriangleArea(-5,5));
        System.out.println(UtilPattaradanai.compute057RightTriangleArea(5,5));

        System.out.println(UtilPattaradanai.computeMagicPattaradanai(1,10,1));

        System.out.println(UtilPattaradanai.evaluate057(60));

        Obj057 o1 = new Obj057("057.9", "Pattaradanai", 100.0);
        Obj057 o2 = new Obj057("057.9", "Srichon", 10.0);

        System.out.println(Obj057.getId057());

        System.out.println(o1.getNamePattaradanai());
        System.out.println(o1.getValue057());
        o1.setNamePattaradanai("Alex");
        System.out.println(o1);

        System.out.println(Obj057.compare(o1,o2));
        System.out.println(o1.isGreaterThan(o2));

    }
}
