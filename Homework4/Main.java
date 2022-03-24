package Courses;

public class Main {
    public static void main(String[] args){

        Student vasya = new Student("Vasya", "Nikitin", Gender.MALE,0, "null");
        Student ilona = new Student("Ilona", "Zinchenko", Gender.FEMALE, 0, "null");
        Student ivan = new Student("Ivan", "Shevchenko", Gender.MALE, 0, "null");
        Student arseniy = new Student("Arseniy", "Gutsal", Gender.MALE, 0, "null");
        Student valik = new Student("Valik", "Pets", Gender.MALE, 0, "null");
        Student igor = new Student("Igor", "Kirichkov", Gender.MALE, 0, "null");
        Student alex = new Student("Alex", "Denisenko", Gender.MALE, 0, "null");
        Student masha = new Student("Masha", "Zelenskaya", Gender.FEMALE, 0, "null");
        Student antonio = new Student("Antonio", "Arestovich", Gender.MALE, 0, "null");
        Student fedir = new Student("Fedir", "Kim", Gender.MALE, 0, "null");
        Student kostya = new Student("Kostya", "Lomachenko", Gender.MALE, 0, "null");

        Group economist = new Group();
        economist.setName("Economist");

        try {
            economist.addStudent(vasya);
            economist.addStudent(ilona);
            economist.addStudent(ivan);
//            economist.addStudent(arseniy);
//            economist.addStudent(valik);
//            economist.addStudent(igor);
//            economist.addStudent(alex);
//            economist.addStudent(masha);
//            economist.addStudent(antonio);
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        CreateStudentFromKeyboard st1 = new CreateStudentFromKeyboard();
        Student newStudent = st1.startCreate();
        System.out.println(newStudent);
        try {
            economist.addStudent(newStudent);
        } catch (GroupOverflowException e) {
            e.getMessage();
        }

        System.out.println(economist.removeStudentByID(2));
        System.out.println(economist);

        try {
            economist.searchStudentByLastName("Low");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        economist.sortStudentByLastName();
    }
}

