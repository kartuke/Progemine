package com.mycompany.klassi_komplekt;

public class Pall {
  protected double x;
  protected double y;
  protected double rd;
  protected double dx;
  protected double dy;
  
  public Pall(double x, double y, double r){
      this.x=x;
      this.y=y;
      this.rd=r;
  }
  
  public void sammuAndmed(double dx, double dy){
      this.dx=dx; this.dy=dy;
  }
  
  public void sammuNurgaAndmed(double nurk,double sammupikkus){
      this.sammuAndmed(sammupikkus*Math.cos(Math.toRadians(nurk)),
              sammupikkus*Math.sin(Math.toRadians(nurk)));
  }
public void liigu(){
    x+=dx; y+=dy;
}
  public double kaugusNullist(){
      return Math.sqrt(x*x+y*y);
  }
  
  public double getX(){return x;}
  public double getY(){return y;}
  public double getR(){return rd;}
 
  
  public double kaugusPallist(Pall teine){
     double dx=getX()-teine.getX();
     double dy=getY()-teine.getY();
     return Math.sqrt(dx*dx+dy*dy);
  }
  public String kasPuutuvad(Pall teine){
      double rad=getR()+teine.getR();
      if(kaugusPallist(teine)< rad)
    {   return "Pallid puutuvad kokku";}
            else{
                    return "Pallid ei puutu kokku";
                    }

        
}
  @Override
  public String toString(){
      return "Pall kohal ("+x+","+y+","+rd+")";
  }
}
