public class Main {
  public static void main(String[] args) {
    System.out.println("2024 Q1!");
    Feeder i = new Feeder(2400);
    i.simulateOneDay(10);
    System.out.println(i.getCurrentFood());

    System.out.println(i.simulateManyDays(10, 10));
    System.out.println(i.getCurrentFood());

    Feeder k = new Feeder(1800);
    k.simulateOneDay(5);
    System.out.println(k.getCurrentFood());
    
    System.out.println(k.simulateManyDays(5, 10));
    System.out.println(k.getCurrentFood());

    Feeder j = new Feeder(0);
    System.out.println(j.simulateManyDays(6, 10));
    System.out.println(j.getCurrentFood());
  }
  
}
