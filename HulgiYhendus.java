import java.util.*;
public abstract class HulgiYhendus extends TakistusKomponent{
   List<TakistusKomponent> komponendid=new ArrayList<TakistusKomponent>();
   public void lisa(TakistusKomponent t){
     komponendid.add(t);
   }
}