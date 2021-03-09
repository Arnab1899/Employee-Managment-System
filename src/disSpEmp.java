import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.Serializable;

public class disSpEmp implements Serializable
{
	disSpEmp()
	{
		Stage s = new Stage();
		
        TextField tf1 = new TextField();
        Button add = new Button("OK");
        
        add.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent actionEvent) 
            {
               Main.emp.display(tf1.getText());
               Main.saveData(Main.emp);
            }
        });
        
        Label l1 = new Label("Enter ID");

        VBox layout = new VBox();
        layout.setSpacing(10);
        
        tf1.setMaxWidth(100);
        
        layout.setPadding(new Insets(40,0,0,130));
        layout.getChildren().addAll(l1,tf1,add);
        
        Scene secondScene = new Scene(layout, 500, 250);
        Stage newWindow = new Stage();
        
        newWindow.setTitle("Enter Requires Data");
        newWindow.setScene(secondScene);
        
        newWindow.setX(s.getX() + 350);
        newWindow.setY(s.getY() + 0);

        newWindow.show();
		
	}

}
