public class Person {

    protected String name, sex;
    protected int age;

    public Person (String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void information () {
        System.out.println("\nName: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }



}
