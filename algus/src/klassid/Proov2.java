package klassid;

public class Proov2 {
    public static void main(String[] arg){
        Pall[] pallid=new Pall[3];
        pallid[0]=new Pall(3,5,1);
        pallid[1]=new Pall (4,6,8);
        pallid[2]=new Pall (-10,8,2);
        int suurim=0;
        for(int i=0; i<pallid.length; i++){
            System.out.println(pallid[i]);
            //Kuvage kordinaatide alguspunktist kõige kaugema palli andmed 
                if (pallid[i].kaugusNullist()>pallid[suurim].kaugusNullist()){ //pallid[suurim] sest hiljem omistatakse suurim=i ja see paneb nad suurimaga võrduma. 
                    suurim=i;
                }
        }
        System.out.println("Kaugeim on:"+pallid[suurim]);
    }
    
}
