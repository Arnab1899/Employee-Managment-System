import java.io.Serializable;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InSal implements Serializable
{
	InSal()
	{      
		Stage primaryStage=new Stage();
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		Label l1 = new Label("Enter ID");
		Label l2 = new Label("Enter Increase Amount");
		
		Button bt = new Button("Add");
		
		bt.setOnAction(new EventHandler<ActionEvent>() 
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				try 
				{
                    Main.emp.increaseSalary(tf1.getText(),Integer.parseInt(tf2.getText()));
                    Main.saveData(Main.emp);
                } 
				catch (InvalidSalaryException e) 
                {
                    e.printStackTrace();
                }	
			}
			
		});
		
		VBox layout = new VBox();
		layout.setSpacing(10);
		layout.setPadding(new Insets(40,0,0,130));
		
        tf1.setMaxWidth(180);
        tf2.setMaxWidth(180);
        
        layout.getChildren().addAll(l1,tf1,l2,tf2,bt);
        
        Scene secondScene = new Scene(layout, 500, 500);
        Stage newWindow = new Stage();
        
        newWindow.setTitle("Enter Requires Data");
        newWindow.setScene(secondScene);
        
        newWindow.setX(primaryStage.getX() + 350);
        newWindow.setY(primaryStage.getY() + 0);

        newWindow.show();
        }
		
	}

