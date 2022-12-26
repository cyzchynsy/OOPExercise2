public class Main {
    public static void main(String[] args) {

        Person p = new Person ("Luis", "Male", 18);
        Kid k = new Kid ("Arthur", "Male", 7, "Grade 1");
        Adult a = new Adult ("Rose", "Female", 27, "Software Engineer");

        p.information();
        k.information();
        k.School();
        a.information();
        a.Work();


    }
}