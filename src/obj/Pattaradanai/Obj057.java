package obj.Pattaradanai;

public class Obj057 {

    private static String id057;
    private String namePattaradanai;
    private double value057;

    public Obj057(String id057, String namePattaradanai, double value057) {
        Obj057.id057 = id057;
        this.namePattaradanai = namePattaradanai;
        this.value057 = value057;
    }

    public static String getId057() {
        return id057;
    }

    public static void setId057(String id057) {
        Obj057.id057 = id057;
    }

    public String getNamePattaradanai() {
        return namePattaradanai;
    }

    public void setNamePattaradanai(String namePattaradanai) {
        this.namePattaradanai = namePattaradanai;
    }

    public double getValue057() {
        return value057;
    }

    public void setValue057(double value057) {
        this.value057 = value057;
    }

    @Override
    public String toString() {
        return "Obj057{" +
                "namePattaradanai='" + namePattaradanai + '\'' +
                ", value057=" + value057 +
                '}';
    }

    public static int compare(Obj057 o1, Obj057 o2){
        if(o1.value057 == o2.value057){
            return 0;
        } else if (o1.value057 <= o2.value057) {
            return -1;
        }
        return 1;
    }

    public boolean isGreaterThan(Obj057 o){
        return this.value057 >= o.value057;
    }
}
