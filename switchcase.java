//This program displays days of the week using switch case
public class switchcase {
    public static void main(String[] args) {
        int dayOfWeek = 7;  
        String dayName;  
        switch (dayOfWeek) {  
           case 1:  
              dayName = "Monday";  
              break;  
           case 2:  
              dayName = "Tuesday";  
              break;  
           case 3:  
              dayName = "Wednesday";  
              break;  
           case 4:  
              dayName = "Thursday";  
              break;  
           case 5:  
              dayName = "Friday";  
              break;  
           case 6:  
              dayName = "Saturday";  
              break;  
           case 7:  
              dayName = "Sunday";  
              break;  
           default:  
              dayName = "Invalid day of week";  
              break;  
        }  
        System.out.println("Day of week: " + dayOfWeek);  
        System.out.println("Day name: " + dayName);  
    }
}
