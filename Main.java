public class Main
{
  public static void main(String[] args) 
  {
    StepTracker tr =  new StepTracker(10000);
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
    tr.addDailyStep(9000);
    tr.addDailyStep(5000);
    System.out.println(tr.averageSteps());

    tr.addDailyStep(13000);
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
    tr.addDailyStep(23000);
    tr.addDailyStep(1111);
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
  }
}
