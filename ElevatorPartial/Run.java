import java.util.*;

public class Run {
public static void main(String []Args)
{
    ArrayList<Floor> Floors = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    System.out.println("  Asensor UCC ");
    String goUp = "\u2191";
    String goDown = "\u2193";
    System.out.println(" s."+ goUp);
    System.out.println(" b."+goDown);
    String opt = scanner.nextLine();
    switch (opt) {
        case "s":
        String Emergency = " \u26A0";
      System.err.println("[1] [2]" );
      System.out.println("[3] [4]");
      System.out.println("[5] [ E."+ Emergency +"  ]");
            break;


            case "b":
            
            break;
        default:
        System.out.println(" La opcion ingresada no existe ");
            break;
    }

}
}
