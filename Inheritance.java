
public class Inheritance {
    public static void main(String[] args){

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5, 4);
        double r2 = obj.divide(10, 3);
        System.out.println(r1 + " " +  Math.round(r2));
    }
}