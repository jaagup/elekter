import java.util.*;
public class JadaYhendus extends HulgiYhendus{
   public double kysiTakistus(){
      double summa=0;
      for(TakistusKomponent t: komponendid){
         summa+=t.kysiTakistus();
      }
      return summa;
   }
}