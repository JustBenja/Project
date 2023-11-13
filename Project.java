import java.util.*;
public class Project {
    public static void main(String args[]) {
        Person I = new Person;
    }
}
interface IamHuman{
    void EnterName();}
class Person implements IamHuman{
    private int Age;
    private String Name;
    private ArrayList<Person> familyTree;
    public Person(int age, String name){
        this.Age = age;
        this.Name = name;
        this.familyTree = new ArrayList<Person>();
    }
    public void EnterName() {
        Scanner input = new Scanner(System.in);
        this.Name = input.nextLine();
        this.Age = input.nextInt();
    }
}