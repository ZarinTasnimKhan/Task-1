package zarintasnim;
import java.util.Scanner;
public class Main {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your section: ");
        String section = input.nextLine();
        System.out.println("Section: " + section);

        Info info = new Info();
        System.out.println("Name: " + info.name);
        System.out.println("Id: " + info.id);

        Hobby hobby = new Hobby();
        System.out.println("Hobby: " + hobby.hobbyName);


    }
}
/*
      Name: Zarin Tasnim Khan
      ID : 2012020178
      Section : D
      Email : cse_2012020178@lus.ac.bd
      Date : 15.07.2021
 */