import java.io.Serializable;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddEmp implements Serializable
{
	AddEmp()
	{
		Button salEmp = new Button("Salaried Employee");
		Button houEmp = new Button("Hourly Employee");
		Button comEmp = new Button("Commission Employee");
		Button exit = new Button("Exit");
		
		salEmp.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) 
			{
				new salEmp();
				Main.saveData(Main.emp);
			}
			
		});
		
		houEmp.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				new houEmp();
				Main.saveData(Main.emp);
			}
			
		});
		
		comEmp.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0)
			{
				new comEmp();
				Main.saveData(Main.emp);
			}
			
		});
		exit.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
                System.exit(0);	
			}
			
		});
		
		VBox layout = new VBox();
        layout.setSpacing(10);
        
        salEmp.setMaxSize(300,300);
		houEmp.setMaxSize(300,300);
		comEmp.setMaxSize(300,300);
		exit.setMaxSize(300,300);
	    
	    
	    layout.setPadding(new Insets(40,30,40,80));
	    layout.getChildren().addAll(salEmp,houEmp,comEmp,exit);
	    
	    Scene s  = new Scene (layout,500,500);
	    
        Stage newWindow = new Stage();
        newWindow.setTitle("Choose your Option");
        newWindow.setScene(s);
        newWindow.show();
        
		
	}

}
