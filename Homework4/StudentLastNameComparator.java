package Courses;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student Vasya = (Student) o1;
        Student Ilona = (Student) o2;

        String LastName1 = Vasya.getLastName();
        String LastName2 = Ilona.getLastName();

        if(LastName1.compareTo(LastName2)>0){
            return 1;
        }
        if(LastName1.compareTo(LastName2)<0){
            return -1;
        }
        return 0;
    }
}
