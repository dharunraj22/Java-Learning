class A{
        public void show(){
            System.out.println("In Class A");
        }
    }

    class B extends A{
        public int a;
        B(){
        this.a = 10;
        }
        public void show(){
            System.out.println("In Class B. Value of a is " + a);
        }

    }

public class dynamic_method_dispatch {

    public static void main(String[] args){
        A obj = new B();
        obj.show();
        System.out.println(((B)obj).a);
    }

}
