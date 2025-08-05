import java.util.Scanner;

public class string_reverse {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

    }
}
