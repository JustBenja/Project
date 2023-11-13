import java.util.Scanner;
public class Boboclat{
    public static void main(String args[]){
        Person H = new Person(15, "Ariel", {1,2,3,4,5});
        System.out.println(Age);
    }
}
interface IamHuman{
    void EnterName();
}
    public class Person implements IamHuman{
        private int Age;
        private String Name;
        private List<Person> familyTree;
        public Person(int age, String name){
            this.Age = age;
            this.Name = name;
            this.familyTree = new List<Person>;
        }
        public void EnterName() {
            Scanner input = new Scanner(System.in);
            this.Name = input.nextLine();
            this.Age = input.nextInt();
            }
        }
