import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UapCse implements Serializable
{
    ArrayList<Employee>employee = new ArrayList<Employee>();
    
    public String name;
    public UapCse()
    {
        this.name = name;
    }
    private void addNewEmployee(Employee e)
    {
        employee.add(e);
    }
    public void addNewEmployee(String nm, String des,String id, double mSal)
    {
        SalariedEmployee em = new SalariedEmployee(nm,des,id,mSal);
        addNewEmployee(em);
    }
    void addNewEmployee(String n, String d, String I, double hr, int hw) 
    {
        HourlyEmployee em = new HourlyEmployee(n,d,I,hr,hw);
        addNewEmployee(em);
    }
    void addNewEmployee(String n,  String  d, String I, double c, double s)
    {
        CommissionEmployee em = new CommissionEmployee(n,d,I,c,s);
        addNewEmployee(em);
    }
    private Employee findEmployee(String id)
    {
        for(int i=0; i<employee.size(); i++)
        {
            Employee em= employee.get(i);
           if(em.getId().equals(id))
           {
               return em;
           }
        }
        //System.out.println("Employee Not Found!");
        JOptionPane.showMessageDialog(null,"Employee Not Found!");
        return null;
    }
    public void increaseSalary(String id, double amt)throws InvalidSalaryException 
    {
        Employee em= findEmployee(id);
        if(em!=null)
            em.increaseSalary(amt);
    }
    public double getSalary(String  id)
    {
        double a;
        Employee em= findEmployee(id);
        if(em!=null)
        {
            a = em.getSalary();
            return a;
        }
        return 0;
    }
    public void display()
    {
        System.out.println(name);
        for(int i=0; i<employee.size(); i++)
        {
            Employee em=employee.get(i);
            em.display();
        }
    }
    public void display(String id)
    {
        Employee b=findEmployee(id);
        if(b!=null)
        {
            b.display();
        }
    }
	
}



