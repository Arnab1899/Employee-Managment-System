import java.io.Serializable;

public  class HourlyEmployee extends Employee implements Serializable 
{
    public double hourlyRate,hourWorked;

    public HourlyEmployee(String name, String designation, String id, double hourlyRate, int hourWorked)
    {
        super(name, designation, id);
        this.hourlyRate=hourlyRate;
        this.hourWorked=hourWorked;

    }
    public double getSalary(int hWorked)
    {
        return hWorked*hourlyRate;
    }
    public  void increaseSalary(double amt)throws InvalidSalaryException
    {
        if(hourlyRate+amt<=500)
        {
            hourlyRate+=amt;
        }
        throw new InvalidSalaryException("Hourly rate can’t be more than 500.");
    }
    public double getSalary()
    {
        return hourWorked*hourlyRate;
    }
    void display()
    {
        super.display();
    System.out.println("hourly rate: "+hourlyRate);
}
}







