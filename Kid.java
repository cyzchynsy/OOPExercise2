public class Kid extends Person {

    protected String gradeLevel;

    Kid (String name, String sex, int age, String gradeLevel) {
        super(name, sex, age);
        this.gradeLevel = gradeLevel;
    }

    void information() {
        super.information();
        System.out.println("Grade Level: " + gradeLevel);
    }

    void School() {
        System.out.println("I'm currently going to school!");
    }

}
