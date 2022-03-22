package Courses;

public class Main {
    public static void main(String[] args){
        Student Vasya = new Student("Vasya", "Nikitin", Gender.MALE,0, "null");
        Student Ilona = new Student("Ilona", "Zinchenko", Gender.FEMALE, 0, "null");
        Student Ivan = new Student("Ivan", "Shevchenko", Gender.MALE, 0, "null");
        Student Arseniy = new Student("Arseniy", "Gutsal", Gender.MALE, 0, "null");
        Student Valik = new Student("Valik", "Pets", Gender.MALE, 0, "null");
        Student Igor = new Student("Igor", "Kirichkov", Gender.MALE, 0, "null");
        Student Alex = new Student("Alex", "Denisenko", Gender.MALE, 0, "null");
        Student Masha = new Student("Masha", "Zelenskaya", Gender.FEMALE, 0, "null");
        Student Antonio = new Student("Antonio", "Arestovich", Gender.MALE, 0, "null");
        Student Fedir = new Student("Fedir", "Kim", Gender.MALE, 0, "null");
        Student Kostya = new Student("Kostya", "Lomachenko", Gender.MALE, 0, "null");
        Group Economist = new Group();
        Economist.setName("Economist");
        try {
            Economist.addStudent(Vasya);
            Economist.addStudent(Ilona);
            Economist.addStudent(Ivan);
            Economist.addStudent(Arseniy);
            Economist.addStudent(Valik);
            Economist.addStudent(Igor);
            Economist.addStudent(Alex);
            Economist.addStudent(Masha);
            Economist.addStudent(Antonio);
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        CreateStudentFromKeyboard st1 = new CreateStudentFromKeyboard();
        Student newStudent = st1.startCreate();
        System.out.println(newStudent);
        try {
            Economist.addStudent(newStudent);
        } catch (GroupOverflowException e) {
            e.getMessage();
        }
        System.out.println(Economist);
        System.out.println("________________________________");

        try {
            Economist.searchStudentByLastName("Girlya");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("________________________________");

        System.out.println(Economist.removeStudentByID(5));
        System.out.println("________________________________");

        Economist.sortStudentByLastName();
    }
}

