package Courses;

import java.util.Arrays;
import java.util.Comparator;

public class Group{
    private String name;
    private Student[] students = new Student[10];
    public Group() {
    }
    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }
    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group {" +
                "name = " + name +
                ", students= " + Arrays.toString(students) +
                '}';
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < this.students.length; i++) {
            if (students[i] != null && i == students.length - 1) {
                throw new GroupOverflowException("Student " + student.getName() + " " + student.getLastName() + " can't be added to the group " + name + ". Group is full");
            } else if (students[i] == null) {
                students[i] = student;
                System.out.println("Student " + student.getName() + " " + student.getLastName() + " is added to group ");
                student.setGroupName(name);
                student.setId(i);
                break;
            }
        }
    }

    public Student searchStudentByLastName (String lastName) throws StudentNotFoundException, NullPointerException {
        for (int i =0; i <students.length; i++) {
            if (students[i] == null) {
                continue;
            } else if (students[i].getLastName() == lastName){
                System.out.println("Student with lastname `" + lastName + "` detected in the group `" + getName() + "` :" + students[i].toString());
                return students[i];
            } else if (students[i].getLastName() != lastName && i == students.length - 1) {
                throw new StudentNotFoundException("Student with lastname `" + lastName + "` didn`t detected in the group `" + name + "`");
            }
        } return null;
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            } else if (students[i].getId() == id) {
                students[i] = null;
                System.out.println("Student with id " + id + " was detected and deleted from the group");
                return true;
            }
        }
        System.out.println("Student with id " + id + " wasn`t detected and deleted from the group");
        return false;
    }

    public void sortStudentByLastName(){
        Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComparator()));
        for(int i=0; i<students.length; i++){
                System.out.println(students[i]);
        }
    }
}
