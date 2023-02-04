public class ClassA {
    public String name;
    public int age;

    public ClassA() {

    }

    public ClassA(String name){
        this.name = name;
    }

    public void showName() {
        System.out.println( "ClassA{" + "name='" + name + '\'' + '}');
    }
}
