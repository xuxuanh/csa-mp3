public class Feeder{
  private int currentFood;

  public Feeder(int gramsOfFood){
    currentFood = gramsOfFood;
  }

  public void simulateOneDay(int numBirds){
    boolean isNormalDay = Math.random()<=0.94;
    int food = (int)(Math.random()*41+10);
    if(isNormalDay){
      currentFood -= numBirds*food;
      if (currentFood < 0 ){
        currentFood = 0;
      }
    }
    else{
      currentFood = 0;
    }
  }

  public int simulateManyDays(int numBirds,int numDays){
    if (currentFood == 0){
      return 0;
    }
    else{
      for (int i = 1; i <= numDays; i++){
        simulateOneDay(numBirds);
        if (currentFood == 0){
          return i;
        }
      }
    }
    return numDays;
  }

  public int getCurrentFood(){
    return currentFood;
  }
}  
 
