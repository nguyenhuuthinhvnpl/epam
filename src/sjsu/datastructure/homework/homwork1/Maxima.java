package sjsu.datastructure.homework.homwork1;

public class Maxima {
    public static void main( String args[] ) {
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal pig = new Animal("pig");
        Animal cow = new Animal("cow");

        Employee bob = new Employee("bob", 100000);
        Employee sue = new Employee("sue", 150000);
        Employee ann = new Employee("ann", 50000);
        Employee tom = new Employee("tom", 75000);

        Animal zoo[] = new Animal[]{cat, dog, pig, cow};
        Employee dept[] = new Employee[]{bob, sue, ann, tom};

        Animal maxAnimal = (Animal) Utility.max(zoo);
        System.out.println("The maximum animal is " +
                maxAnimal.getName());

        Employee maxEmployee = (Employee) Utility.max(dept);
        System.out.println("The maximum employee is " +
                maxEmployee.getName());

        ann.increaseBy(20000);
        bob.increaseBy(60000);
       // System.out.println(bob.getSalary());
        maxEmployee = (Employee) Utility.max(dept);
        System.out.println("The maximum employee is " +
                maxEmployee.getName());
    }
}