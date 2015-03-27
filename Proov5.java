public class Proov5{
  public static void main(String[] arg){
     JadaYhendus lambid=new JadaYhendus();
     lambid.lisa(new Takisti(50));
     lambid.lisa(new Takisti(50));
     lambid.lisa(new Takisti(50));
     lambid.lisa(new Takisti(50));
     RoopYhendus maja=new RoopYhendus();
     maja.lisa(lambid);
     maja.lisa(new Takisti(20));  //mootor
     JadaYhendus vooluring=new JadaYhendus();
     vooluring.lisa(maja);
     vooluring.lisa(new Takisti(5)); //juhtmed
     System.out.println(vooluring.kysiTakistus());
     System.out.println(vooluring.vool(230));
  }
}