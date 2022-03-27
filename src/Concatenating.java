import java.util.Scanner;
public class Concatenating {
    public static void main (String[] args){
        String firstname, lastname, fullname;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input last name: ");
        firstname = sc.next();
        System.out.println("Input first name: ");
        lastname = sc.next();

        fullname = firstname.concat(lastname);

        System.out.println("Is a Composition of the string: "+fullname.equalsIgnoreCase(lastname));
        System.out.println("Your names are: "+ fullname);
        System.out.println("Compare: "+fullname.compareTo(lastname));

    }
}
