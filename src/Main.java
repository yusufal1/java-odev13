import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if(day >= 22)
                    System.out.println("Kova");
                else
                    System.out.println("Oğlak");
                break;
            case 2:
                if(day >= 20)
                    System.out.println("Balık");
                else
                    System.out.println("Kova");
                break;
            case 3:
                if(day >= 21)
                    System.out.println("Koç");
                else
                    System.out.println("Balık");
                break;
            case 4:
                if(day >= 21)
                    System.out.println("Boğa");
                else
                    System.out.println("Koç");
                break;
            case 5:
                if(day >= 22)
                    System.out.println("İkizler");
                else
                    System.out.println("Boğa");
                break;
            case 6:
                if(day >= 23)
                    System.out.println("Yengeç");
                else
                    System.out.println("İkizler");
                break;
            case 7:
                if(day >= 23)
                    System.out.println("Aslan");
                else
                    System.out.println("Yengeç");
                break;
            case 8:
                if(day >= 23)
                    System.out.println("Başak");
                else
                    System.out.println("Aslan");
                break;
            case 9:
                if(day >= 23)
                    System.out.println("Terazi");
                else
                    System.out.println("Başak");
                break;
            case 10:
                if(day >= 23)
                    System.out.println("Akrep");
                else
                    System.out.println("Terazi");
                break;
            case 11:
                if(day >= 22)
                    System.out.println("Yay");
                else
                    System.out.println("Akrep");
                break;
            case 12:
                if(day >= 22)
                    System.out.println("Oğlak");
                else
                    System.out.println("Yay");
                break;
        }
    }
}