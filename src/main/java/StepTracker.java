import java.util.ArrayList;

public class StepTracker
{
 private int numDays = 0;
 private int total = 0;
 private int min = 0;
 private int totDays = 0;

 public StepTracker(int active){
  min = active;
 }

 public void addDailySteps(int steps){ // changed return type to void
  if(steps >= min){
   numDays++;
  }
  totDays++;
  total = total + steps;
 }

 public int activeDays(){
  return numDays;
 }

 public double averageSteps(){
  if (totDays == 0) {
    return 0.0; 
  }
  double avg = (double) total / totDays;
  return avg;
 }
}
