public class Calc{

    Calc(){
        System.out.println("In calc constructor");
    }


    Calc(int a){
        System.out.println("In calc constructor parameterized");
    }

    public int add(int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }
}