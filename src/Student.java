

public class Student {
    Course physics;
    Course mathematics;
    Course biology;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course Physics, Course Mathematics, Course Biology) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.physics = Physics;
        this.mathematics = Mathematics;
        this.biology = Biology;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int PhysicsNote, int PhysicsNoteQuiz, int MathematicsNote, int MathematicsNoteQuiz, int BiologyNote, int BiologyNoteQuiz) {
        if (PhysicsNote >= 0 && PhysicsNote <= 100) {
            this.physics.note = PhysicsNote;
            this.physics.quiz = PhysicsNoteQuiz;
        }
        if (MathematicsNote >= 0 && MathematicsNote < 100) {
            this.mathematics.note = MathematicsNote;
            this.mathematics.quiz = MathematicsNoteQuiz;
        }
        if (BiologyNote >= 0 && BiologyNote <= 100) {
            this.biology.note = BiologyNote;
            this.biology.quiz = BiologyNoteQuiz;
        }
    }

    void isPass() {
        double averagePhysics = (this.physics.note * 0.8) + (this.physics.quiz * 0.2);
        double averageMathematics = (this.mathematics.note * 0.8) + (this.mathematics.quiz * 0.2);
        double averageBiology = (this.biology.note * 0.8) + (this.biology.quiz * 0.2);
        this.average = ((averagePhysics + averageMathematics + averageBiology) / 3.0);

        printNote();

        if (this.average > 55) {
            System.out.println("Class Passed...Congratulations...");
            this.isPass = true;
        } else {
            System.out.println("Class Failed...Work Harder...");
            this.isPass = false;
        }

    }


    void printNote() {
        System.out.println("Student : " + this.name);
        System.out.println(this.physics.name + "Note : " + this.physics.note);
        System.out.println(this.mathematics.name + "Note : " + this.mathematics.note);
        System.out.println(this.biology.name + "Note : " + this.biology.note);
        System.out.println("Average : " + this.average);
    }

}
