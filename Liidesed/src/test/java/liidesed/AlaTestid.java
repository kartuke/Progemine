package liidesed;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
public class AlaTestid {
    public AlaTestid() {}
    Ala a;  
    @Before
    public void setUp(){
       a=new Ala(10, 10);  
    }
    @Test public void loomine(){
       assertThat(a.kysiKilpkonn().kysiX(), is(0));
       assertThat(a.toString(), is(
               ">.........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n")
       );
    }
    @Test public void liikumine1(){
       a.k2sk('e'); 
       assertThat(a.toString(), is(
               "*>........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n")
       );
    }
    @Test public void liikumine2(){
       a.k2sud("eepee");  
       assertThat(a.toString(), is(
               "***.......\n"+
               "..*.......\n"+
               "..v.......\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n")
       );
    }
    @Test public void sobivKoht(){
        assertTrue(a.kasVaba(3, 2));
        assertTrue(a.kasVaba(9, 9));
        assertFalse(a.kasVaba(9, 10));
        assertFalse(a.kasVaba(10, 9));
        assertFalse(a.kasVaba(0, 0));
        assertFalse(a.kasVaba(-1, 0));
         assertFalse(a.kasVaba(0, -1));
    }
    @Test public void vaiksemAlaKohad(){
        Ala a2= new Ala(3,6);
        a2.k2sud("epee");
        assertTrue(a2.kasVaba(2, 5));
        assertFalse(a2.kasVaba(5, 2));
        assertTrue(a2.kasVaba(0, 0));
        assertFalse(a2.kasVaba(1, 2));
    }
}