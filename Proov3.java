public class Proov3{
  public static void main(String[] arg){
     JadaYhendus j=new JadaYhendus();
     j.lisa(new Takisti220oomi());
     j.lisa(new Takisti220oomi());
     System.out.println(j.kysiTakistus());
     JadaYhendus j2=new JadaYhendus();
     j2.lisa(new Takisti(1000));
     j2.lisa(new Takisti(1000));
     System.out.println(j2.kysiTakistus());
     JadaYhendus j3=new JadaYhendus();
     j3.lisa(j);
     j3.lisa(j2);
     
  }
}