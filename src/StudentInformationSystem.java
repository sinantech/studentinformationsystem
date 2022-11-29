public class StudentInformationSystem {
    public static void main(String[] args) {

        Teacher physicsTeacher = new Teacher("Alec", "PHY", "356285448", 57);
        Course Physics = new Course("Physics", "156", "PHY");
        Physics.addTeacher(physicsTeacher);

        Teacher mathematicsTeacher = new Teacher("George", "MATH", "452885221", 43);
        Course Mathematics = new Course("Mathematics", "211", "MATH");
        Mathematics.addTeacher(mathematicsTeacher);

        Teacher biologyTeacher = new Teacher("Trevor", "BIO", "477152369", 39);
        Course Biology = new Course("Biology", "305", "BIO");
        Biology.addTeacher(biologyTeacher);

        Student firstStudent = new Student("Sinan", "551", "5", Physics, Mathematics, Biology);
        firstStudent.addBulkExamNote(40,50, 60,70 ,80,90);

        firstStudent.isPass();

        System.out.println("=================================");

        Student SecondStudent = new Student("Erdem", "287", "4", Physics, Mathematics, Biology);
        SecondStudent.addBulkExamNote(74,85, 82,40, 93,60);

        SecondStudent.isPass();

        System.out.println("==================================");

    }
}