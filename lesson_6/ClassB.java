public class ClassB extends ClassA {
    public String name;
    public int age;

    public ClassB() {
        super();
    }

    //Pham Minh
    public ClassB(String name) {
        super(name);

        this.name = name;
    }


    public void showAge() {
        System.out.println("Age cua classB la class con: " + age);
        System.out.println("Age cua classB nhung cua classA class cha: " + super.age);
    }


    public void setAgeClassA(int age) {
        super.age = age;
    }
    public void showName() {
        System.out.println("ClassB{" + "name='" + name + '\'' + '}');
        super.showName();
    }
}
