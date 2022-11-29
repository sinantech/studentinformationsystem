public class Teacher {
    String name;
    String branch;
    String mobilephone;
    int age;

    Teacher(String name, String branch, String mobilephone, int age) {
        this.name = name;
        this.branch = branch;
        this.mobilephone = mobilephone;
        this.age = age;
    }

    void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
        System.out.println("Mobile Phone Number : " + this.mobilephone);
        System.out.println("Age : " + this.age);
    }

}
