import java.io.Serializable;

public class CommissionEmployee extends Employee implements Serializable 
{
    public double commission,sale;
    public CommissionEmployee(String name, String designation, String id, double commission,double sale)
    {
        super(name, designation, id);
        this.commission=commission;
        this.sale=sale;

    }
    public double getSalary(double sale){
        return commission*sale;
    }
    public  void increaseSalary(double amt)throws InvalidSalaryException{
        if(commission+amt<=.3){
            commission+=amt;
        }
        throw new InvalidSalaryException("Commission cannot be more than 30%.");

    }
    public double getSalary(){
        return (commission/100)*sale;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Commission Amount: "+commission);
    }
}




