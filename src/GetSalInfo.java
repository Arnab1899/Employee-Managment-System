import java.io.Serializable;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GetSalInfo implements Serializable
{
	GetSalInfo()
	{
		Stage s = new Stage();
		
		TextField t_one  = new TextField();
		//TextField t_two  = new TextField();
		
		Button bt  = new Button("Enter");
		
		bt.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				 //System.out.println("Salary: "+Main.emp.getSalary(t_one.getText()));
				 JOptionPane.showMessageDialog(null,"Salary: "+Main.emp.getSalary(t_one.getText()));
				 Main.saveData(Main.emp);
			}
			
		});
		
		Label labelOne = new Label("Enter ID");
		
		VBox vbx = new VBox();
        vbx.setSpacing(10);
        
        t_one.setMaxWidth(180);
      
        
        vbx.setPadding(new Insets(40,0,0,130));
        vbx.getChildren().addAll(labelOne,t_one,bt);
        
        Scene SecondScene = new Scene(vbx, 500, 500);
        Stage newWindow = new Stage();
        
        newWindow.setTitle("Enter Information");
        newWindow.setScene(SecondScene);
        
        newWindow.setX(s.getX() + 350);
        newWindow.setY(s.getY() + 0);

        newWindow.show();
		
	}

}
