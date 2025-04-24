import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int numDays = 0;
 private int total = 0;
 private int min = 0;
 private int totDays = 0;

 public StepTracker(int active){
  min = active;
 }

 public int addDailySteps(int steps){
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
  private double avg = total/totDays;
  return avg;
 }
} 
