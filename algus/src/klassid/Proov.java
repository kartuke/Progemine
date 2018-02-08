
package klassid;

public class Proov {
    public static void main(String[] arg){
        Pall p1=new Pall (3,5,0.5);
        Pall p2=new Pall (4,6,0.5);

        System.out.println(p1 + "Kaugus alguskohast:"+p1.kaugusNullist());
        System.out.println(p2);
        System.out.println("Omavaheline kaugus:"+p1.kaugusPallist(p2));
        System.out.println(p1.kasPuutuvad(p2));
        //System.out.println("Omavaheline kaugus:"+p2.kaugusPallist(p1));
       
    }
    
}
