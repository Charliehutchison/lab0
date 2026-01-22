

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




    public static void main(String args[]) {
        
        Employee e1 = new Employee("Charlie", 19);

        System.out.println(e1.getName());

        
        e1.setName("Gavin");

        System.out.println(e1.getName());
       
        System.out.println(e1);

        // I created another method called getID() similar to get name and then printed it out.
        System.out.println(e1.getID());
    }
}
