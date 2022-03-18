import java.util.Scanner;

public class mainWatermelon {

    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        int Weight = scan.nextInt();
        if (Weight == 2){
            System.out.println("NO");
        }
        else if (Weight%2 == 0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
