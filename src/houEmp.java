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

public class houEmp implements Serializable 
{
	houEmp()
	{
Stage Stage=new Stage();
		
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6 = new TextField();
        
        Button add = new Button("Add");
        
        add.setOnAction(new EventHandler<ActionEvent>()
        {

			@Override
			public void handle(ActionEvent arg0) 
			{
				Main.emp.addNewEmployee(tf1.getText(),tf2.getText(),tf3.getText(),Integer.parseInt(tf4.getText()),Integer.parseInt(tf5.getText()));
				Main.saveData(Main.emp);
				
			}
        	
        });
        
        Label l1 = new Label("Enter Name");
        Label l2 = new Label("Enter Designation");
        Label l3 = new Label("Enter ID");
        Label l4 = new Label("Enter Salary");
        Label l5 = new Label("Enter Hour Rate");
        Label l6 = new Label("Enter Total Hour");
       
        VBox layout = new VBox();
        layout.setSpacing(10);
        
        
        tf1.setMaxWidth(180);
        tf2.setMaxWidth(180);
        tf3.setMaxWidth(180);
        tf4.setMaxWidth(180);
        tf5.setMaxWidth(180);
        tf6.setMaxWidth(180);
       
        layout.setPadding(new Insets(40,0,0,130));
        layout.getChildren().addAll(l1,tf1,l2,tf2,l3,tf3,l4,tf4,l5,tf5,l6,tf6,add);
        Scene SecondScene = new Scene(layout, 500, 500);
        Stage newWindow = new Stage();
        
        newWindow.setTitle("Enter Hourly Employee Imformation");
        newWindow.setScene(SecondScene);
        
        newWindow.setX(Stage.getX() + 350);
        newWindow.setY(Stage.getY() + 0);

        newWindow.show();   
	}

}
