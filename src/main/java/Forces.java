import java.util.Scanner;

public class Forces {
    int Forces[]={0,0,0};
    public void addForces(int xdir, int ydir, int zdir){
        Forces[0]+=xdir;
        Forces[1]+=ydir;
        Forces[2]+=zdir;
    }
    public String Check(){
        if(Forces[0] == 0 && Forces[1] == 0 && Forces[2] == 0) return "YES";
        else return "NO";
    }
}