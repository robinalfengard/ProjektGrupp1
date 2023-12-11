import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printFirstMenu();
    }

    private static void printFirstMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välkommen till skolhanteraren");
        System.out.println("1. Gå till studentsidan");
        System.out.println("2. Admin");
        String userInput = sc.nextLine();
        if(userInput.equals("1")){
            printStudentMenu();
        } else if (userInput.equals("2")) {
            printAdminMenu();
        } else{
            System.out.println("Välj mellan 1 eller 2");
        }
    }

    private static void printStudentMenu(){

        System.out.println("1: Öva på engelska glosor");
        System.out.println("2: Se betyg");
        //System.out.println("Öva på matematik");
        //System.out.println("");
    }

    private static void printAdminMenu(){
        // Switch
        System.out.println("1: Lägg till glosor"); // case1
        System.out.println("2: Ta bort glosor"); // case2
        System.out.println("3: Lägg till student"); // case3
        System.out.println("4: Ta bort student"); // case4
        System.out.println("5: Uppdatera studentinfo"); // case5
        System.out.println("6: Gå tillbaka"); // case6
    }

    private static void printGradesMenu(){
        // getStudentGrade()
        System.out.println("Engelska: VG");
    }
}