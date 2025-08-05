class Calc{

    int num1;
    int num2;



    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public Calc() {
        //TODO Auto-generated constructor stub
    }


    public int getNum1() {
        return num1;
    }


    public void setNum1(int num1) {
        this.num1 = num1;
    }


    public int getNum2() {
        return num2;
    }


    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int add(int n1, int n2){
        // System.out.println("Add");
        int result = n1 + n2;
        return result;
    }
}

class Student{
    String name;
    int age;
}

public class obj {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Dharun";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "Raj";
        s2.age = 22;

        Student students[] = {s1, s2};
        // Student students[] = new Student[2];
        System.out.println(students[0]);

    }
}
