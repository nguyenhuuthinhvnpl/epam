package sjsu.datastructure.homework.homwork1;

public class Employee implements Comparable, Growable {
    private String name;
    private double salary;

    public Employee( String name, double salary ) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo( Object otherEmployee ) {
        if (this.salary == ((Employee) otherEmployee).salary) {
            return 0;
        } else if (this.salary > ((Employee) otherEmployee).salary) {
            return 1;
        } else return -1;
    }

    @Override
    public void increaseBy( double amount ) {
        this.salary += amount;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }
}