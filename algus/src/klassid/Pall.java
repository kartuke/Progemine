package klassid;

public class Pall {
  protected double x;
  protected double y;
  //lisage pallide raadius
  //lisage käsk kontrollimaks, kas kaks palli puutuvad kokku
  protected double rd;
  
  public Pall(double x, double y, double r){
      this.x=x;
      this.y=y;
      this.rd=r;
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
      return "Pall kohal ("+x+","+y+")";
  }
}
