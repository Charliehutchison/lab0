

/***
 * Class that represents an employee in a company
 */

public class Employee {
    private String name;
    private int id;
    private int age;

    //employee counter
    private static int employeeCounter = 0;

    //Constructor
    Employee(String name, int age){
        this.name = name;
        this.age = age;

        this.id = employeeCounter;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String toString(){
        return "Employee information => {" + "name = " + name + " age = " + age + " id = " + id + "}";
    }

    public int getID(){
        return id;
    }


    // TODO:
    // - declare the following instance variables: name, id, age
    // - what types should you use for each? (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
    // - what access modifiers? (https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

    // TODO: declare a static variable `employeeCounter` as a counter of Employee objects

    // TODO: add a constructor that takes a name and age as parameters and initializes all instance variables
    // https://www.geeksforgeeks.org/java/constructors-in-java/

    // TODO: create getter and setter methods for name and id
    // https://www.w3schools.com/java/java_encapsulation.asp

    // TODO: override the toString method. Be careful when you write its signature
    // https://www.geeksforgeeks.org/java/object-tostring-method-in-java/

    public static void main(String args[]) {
        // TODO: create an object of type Employee using the constructor you created
        Employee e1 = new Employee("Charlie", 19);

        // TODO: choose the instance variable you created a getter and setter for and print its contents either directly or using the getter
        System.out.println(e1.getName());

        // TODO: now call the setter and change the value of the instance variable to something else
        e1.setName("Gavin");

        // TODO: confirm that the change took place by printing it again
        System.out.println(e1.getName());
        // TODO: print the object (it should implicitly call the toString method you overrode)
        System.out.println(e1);

        // I created another method called getID() similar to get name and then printed it out.
        System.out.println(e1.getID());
    }
}
