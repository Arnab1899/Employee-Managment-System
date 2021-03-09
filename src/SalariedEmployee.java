import java.io.Serializable;

public class SalariedEmployee extends Employee implements Serializable 
{
    public double monthlySalary;

    public SalariedEmployee(String name, String designation, String id, double monthlySalary) 
    {
        super(name, designation, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException 
    {
        if(amt<0)
        {
            throw new InvalidSalaryException("Increase amount should be a positive number.");
        }
        monthlySalary+=amt;
    }
    @Override
    public double getSalary() 
    {
        return monthlySalary;
    }
    void display()
    {
        super.display();
        System.out.print("Monthly Salary = "+ monthlySalary);
    }
}




