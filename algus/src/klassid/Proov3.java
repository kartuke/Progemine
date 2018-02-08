package klassid;
import java.util.*;

public class Proov3 {
    public static void main(String[] arg){
        List<Pall> pallid=new ArrayList<Pall>();
        pallid.add(new Pall(3,5,1));
        pallid.add(new Pall (4,6,8));
        pallid.add(new Pall (-10,8,2));
        pallid.add(new Pall (-5,1,6));
        //kuva suurima raadiusega pall
        Pall suurim=pallid.get(0);
 
        for(Pall p:pallid){
            if(p.getR()>suurim.getR()){suurim=p;}
            System.out.println(p);
            }
        System.out.println("suurim on:"+suurim);
        }
    
 }
    
