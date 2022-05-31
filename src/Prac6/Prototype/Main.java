package Prac6.Prototype;

public class Main {
    public static void main(String[] args) {
        Project master = new Project(1,"Source Proj","something" );
        Factory factory = new Factory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}
