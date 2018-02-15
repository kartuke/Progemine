package com.mycompany.klassi_komplekt;
import static org.mockito.Mockito.*;

public class proov1 {
    public static void main(String[]arg){
        Vagun v1=mock(Vagun.class);
        when(v1.kysiasukoht()).thenReturn(7);
        System.out.println(v1.kysiasukoht());
        System.out.println(v1.kysiasukoht());
        verify(v1, times(2)).kysiasukoht();
        when(v1.edasi(anyInt())).thenCallRealMethod(); //kui see ära jätta tuleb -1 asemel 0
        
        when(v1.edasi(1)).thenReturn(1);
        when(v1.edasi(2)).thenReturn(2);
        System.out.println(v1.edasi(2));
        System.out.println(v1.edasi(5));
        //mocki abil et tagasi väljastab -2
        when(v1.tagasi(anyInt())).thenReturn(-2);
        System.out.println(v1.tagasi(3));
    } 
    
}