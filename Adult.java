public class Adult extends Person{

    String job;

    Adult (String name, String sex, int age, String job) {
        super(name, sex, age);
        this.job = job;
    }

    void information() {
        super.information();
        System.out.println("Job: " + job);
    }

    void Work() {
        System.out.println("I'm currently working!");
    }
}
