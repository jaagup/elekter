public class Proov2{
   public static void main(String[] arg){
      TakistusKomponent t=new Takisti220oomi();
      Vooluallikas telefonilaadija=new Laadija(5, 1.2);
      telefonilaadija.yhendaTarbija(t);
      System.out.println(telefonilaadija.kysiVool());
   }
}