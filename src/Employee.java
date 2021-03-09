abstract class Employee 
{
    private String name,designation;
    private String id;

    public Employee(String name, String designation, String id) 
    {
        this.name = name;
        this.designation = designation;
        this.id = id;
    }
    void display()
    {
        System.out.print(String.format("Name = %s Designation = %s Id = %d ",name,designation,id));
    }

    public String getName() 
    {
        return name;
    }

    public String getDesignation()
    {
        return designation;
    }

    public String getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setDesignation(String designation) 
    {
        this.designation = designation;
    }

    public void setId(String id) 
    {
        this.id = id;
    }
    public abstract void increaseSalary(double amt) throws InvalidSalaryException;
    public abstract double getSalary();
}