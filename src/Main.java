import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application 
{
   static String filename = "report.txt";
   
   public static void main(String[] args)
   {
	   UapCse e = readData();
	   UapCse e2  = saveData(e);
	   
	   launch(args);
   } 
   
   static UapCse emp = new UapCse();
  
	@Override
	public void start(Stage stage) throws Exception 
	{
		Button AddEmp = new Button ("Add a New Employee");
		Button GetSalInfo = new Button ("Salary Information of a Specific Employee");
		Button InSal =  new Button ("Increase The Salary of an Employee");
		Button disSpEmp = new Button ("Details of a Specific Employee");
		Button disListemp = new Button("List of The Employees");
		Button exit = new Button("Exit");
		
		AddEmp.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				new AddEmp();
			}
			
		});
		
		GetSalInfo.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				new GetSalInfo();
			}
			
		});
		
		InSal.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				new InSal();
			}
			
		});
		
		disSpEmp.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				new disSpEmp();
			}
			
		});
		disListemp.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				Main.emp.display();
			}
			
		});
		
		exit.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				System.out.println("Successfully Exit");
                System.exit(0);	
			}
			
		});
		
		VBox layout = new VBox();
		layout.setSpacing(10);
		
		Text t = new Text();
		t.setText("Employee Management System");
		t.setFont(new Font(20));
		
		AddEmp.setMaxSize(300,300);
		GetSalInfo.setMaxSize(300,300);
		InSal.setMaxSize(300,300);
		disSpEmp.setMaxSize(300,300);
		disListemp.setMaxSize(300,300);
	    exit.setMaxSize(300,300);
	    
	    
	    layout.setPadding(new Insets(40,30,0,90));
	    layout.getChildren().addAll(AddEmp,GetSalInfo,InSal,disSpEmp,disListemp,exit);
	    
	    Scene s  = new Scene (layout,500,500);
	    
	    stage.setTitle("Employee Managment System");
	    stage.setScene(s);
	    stage.show();
		
	}
	
	UapCse em = new UapCse();
	
	private static UapCse readData()
	{
		UapCse emp =  new UapCse(); 
		
		try {
			FileInputStream in = new FileInputStream(filename);
			ObjectInputStream out = new ObjectInputStream(in);
			emp = (UapCse) out.readObject();
		}
		catch (IOException | ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog(null,"No Data Availble Right Now.");
		}
		
		return emp;
	}
	
	public static UapCse saveData(UapCse b)
	{
		try
		{
			ObjectOutputStream p = new ObjectOutputStream(new FileOutputStream(filename));
			p.writeObject(b);
			p.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
		return b;
	}
}

