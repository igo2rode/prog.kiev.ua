package Courses;

import java.util.Scanner;

public class CreateStudentFromKeyboard{
    Scanner sc = new Scanner(System.in);

    public Student startCreate(){
        String name;
        String lastName;
        String gender;
        String groupName;
        int id;

        System.out.println("Name is ");
        name = sc.nextLine();

        System.out.println("LastName is ");
        lastName = sc.nextLine();

        System.out.println("Gender is (MALE or FEMALE)");
        gender = sc.nextLine();

        System.out.println("GroupName is ");
        groupName = sc.nextLine();

        System.out.println("Id is ");
        id = sc.nextInt();

        return new Student(name, lastName, Gender.valueOf(gender), id, groupName);
    }

}
