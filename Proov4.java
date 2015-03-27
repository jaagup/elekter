public class Proov4{
  public static void main(String[] arg){
     RoopYhendus r=new RoopYhendus();
     r.lisa(new Takisti220oomi());
     r.lisa(new Takisti220oomi());
     System.out.println(r.kysiTakistus());
     JadaYhendus j=new JadaYhendus();
     j.lisa(r);
     j.lisa(new Takisti(1000));
     System.out.println(j.kysiTakistus());
  }
}