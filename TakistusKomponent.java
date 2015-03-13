abstract class TakistusKomponent{
   abstract double kysiTakistus();
   /**
   *  Leitakse etteantud pigele vastav vool.
   *  @param pinge - rakendatav pinge voltides.
   */
   public double vool(double pinge){
      return pinge/kysiTakistus();
   }
}