
package kata1;

import java.util.Date;


public class Student {
    private String name;
    private Date birthDate;
   
    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
              
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    
    private Date today(){
        return new Date();
    }
    public int getAge(){
        return(int)getYearsInDays(
            getDaysInHours(
            getHoursInMinutes(
            getMinutesInSeconds(
            getSecondsInMilliseconds(
                today().getTime()-birthDate.getTime()
            )))));
          
    } 
    private long getSecondsInMilliseconds(long milliseconds){
        return milliseconds/1000;
    }
    private long getMinutesInSeconds(long seconds){
        return seconds/60;
    }
    private long getHoursInMinutes(long minutes){
        return minutes/60;
    }
    private long getDaysInHours(long hours){
        return hours/24;
    }
    private long getYearsInDays(long days){
        return days/365;
    }
    
    
}
