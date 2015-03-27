import java.util.*;
public class RoopYhendus extends HulgiYhendus{
   public double kysiTakistus(){
      double summa=0;
      for(TakistusKomponent t: komponendid){
         summa+=1/t.kysiTakistus();
      }
      return 1/summa;
   }
}