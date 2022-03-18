import java.util.Scanner;

public class mainForces {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int Forces[] = {0,0,0};
        int lineNum = scan.nextInt();
        for(int i=0;i<lineNum;i++){
            int xdir = scan.nextInt();
            int ydir = scan.nextInt();
            int zdir = scan.nextInt();
            Forces[0]+=xdir;
            Forces[1]+=ydir;
            Forces[2]+=zdir;
        }
        if(Forces[0]==0 && Forces[1]==0 && Forces[2]==0){System.out.println("YES");}
        else System.out.println("NO");
    }
}