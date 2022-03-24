package Courses;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student vasya = (Student) o1;
        Student ilona = (Student) o2;

        String lastName1 = vasya.getLastName();
        String lastName2 = ilona.getLastName();

        if(lastName1.compareTo(lastName2)>0){
            return 1;
        }
        if(lastName1.compareTo(lastName2)<0){
            return -1;
        }
        return 0;
    }
}
