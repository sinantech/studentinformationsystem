public class StudentInformationSystem {
    public static void main(String[] args) {

        Teacher physicsTeacher = new Teacher("Alec", "PHY", "356285448", 57);
        Course physics = new Course("Physics", "156", "PHY");
        physics.addTeacher(physicsTeacher);

        Teacher mathematicsTeacher = new Teacher("George", "MATH", "452885221", 43);
        Course mathematics = new Course("Mathematics", "211", "MATH");
        mathematics.addTeacher(mathematicsTeacher);

        Teacher biologyTeacher = new Teacher("Trevor", "BIO", "477152369", 39);
        Course biology = new Course("biology", "305", "BIO");
        biology.addTeacher(biologyTeacher);

        Student firstStudent = new Student("Sinan", "551", "5", physics, mathematics, biology);
        firstStudent.addBulkExamNote(40,50, 60,70 ,80,90);

        firstStudent.isPass();

        System.out.println("=================================");

        Student secondStudent = new Student("Erdem", "287", "4", physics, mathematics, biology);
        secondStudent.addBulkExamNote(74,85, 82,40, 93,60);

        secondStudent.isPass();

        System.out.println("==================================");

    }
}