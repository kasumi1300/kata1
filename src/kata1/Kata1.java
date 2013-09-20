package kata1;

import javax.swing.*;
import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Date birthDate = new Date(88,1,2);
        Student s1 = new Student("Raquel", birthDate);
        System.out.println (s1.getBirthDate());
        System.out.println (s1.getName());
        System.out.println (s1.getAge());
        JOptionPane.showMessageDialog(null,s1.getAge());
    }
}
