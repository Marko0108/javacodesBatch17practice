package class5;

/*
Write a program that will print weather is weekday od weekend
if any day from 1-5 output "It i a weekday", anyday from 6-7 output "It is a weekend
any other day output "Invalid day"
 */
public class TaskWeekday {

    public static void main(String[] args) {

       int day=6;
       if (day>=1 && day<=5) {
           System.out.println("It is a weekday");
       } else if (day==6|| day==7) {
           System.out.println("It's a weekend");
       }else {
           System.out.println("Invalid Day");
       }
    }
}

