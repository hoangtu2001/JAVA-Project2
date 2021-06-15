package week10.lab10;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class SpinningCal extends Application
{
    private Spinner<String> stringSpinner;
    private Text text;
    private TextField text1, text2;
    public Label label1, label2;
    public void start(Stage primaryStage)
    {	
    	Font font2 = new Font(16);

		label1 = new Label("Input 1:");
		label1.setFont(font2);
	
		text1 = new TextField();
		text1.setFont(font2);
		text1.setPrefWidth(100);
		text1.setAlignment(Pos.BASELINE_CENTER);
		
		label2 = new Label("Input 2:");
		label2.setFont(font2);
		
		text2 = new TextField();
		text2.setFont(font2);
		text2.setPrefWidth(100);
		text2.setAlignment(Pos.BASELINE_CENTER);

        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Regular Calculator", "Geometry Calculator", "Scientific Calculator");
        stringSpinner = new Spinner<String>(list);
        stringSpinner.getStyleClass().add(
            Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);
        stringSpinner.valueProperty().addListener(this::spinning);
       
        
        text = new Text();
        text.setFont(new Font("Helvetica", 24));
        
        
        HBox pane1 = new HBox(label1, text1);
        pane1.setAlignment(Pos.CENTER);
        HBox pane2 = new HBox(label2, text2);
        pane2.setAlignment(Pos.CENTER);
        
        VBox pane = new VBox(pane1, pane2,stringSpinner, text);
        pane.setStyle("-fx-background-color: skyblue");
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(25);
        
        Scene scene = new Scene(pane, 300, 500);
        
        primaryStage.setTitle("Spinner Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void spinning(ObservableValue<? extends String> property, String oldStr, String newStr)
    {
        int input1 = Integer.parseInt(text1.getText());
        int input2 = Integer.parseInt(text2.getText());
        String string = newStr.toString();
        if(string == "Regular Calculator") {
        	AbstractCal Cal = new RegularCal(input1, input2);
        	text.setText(string+":"+"\n"+
        	"Addition:"+ Cal.Addition()+"\n"+
        	"Subtraction:"+ Cal.Subtraction()+"\n"+
        	"Multiplication:"+ Cal.Multiplication()+"\n"+
        	"Division:"+ String.format("%.2f",Cal.Division()));
        }
        else if(string == "Scientific Calculator") {
        	AbstractCal Cal = new ScientificCal(input1, input2);
        	text.setText(string+":"+"\n"+
        	"Addition:"+ Cal.Addition()+"\n"+
        	"Subtraction:"+ Cal.Subtraction()+"\n"+
        	"Multiplication:"+ Cal.Multiplication()+"\n"+
        	"Division:"+ String.format("%.2f",Cal.Division())+"\n"+
        	"Log of "+input1+": "+String.format("%.2f",((ScientificCal) Cal).logarit1())+"\n"+
        	"Log of "+input2+": "+String.format("%.2f",((ScientificCal) Cal).logarit2()));
        }
        else if(string == "Geometry Calculator") {
        	AbstractCal Cal = new GeometryCal(input1, input2);
        	text.setText(string+":"+"\n"+
        	"Addition:"+ Cal.Addition()+"\n"+
        	"Subtraction:"+ Cal.Subtraction()+"\n"+
        	"Multiplication:"+ Cal.Multiplication()+"\n"+
        	"Division:"+ String.format("%.2f",Cal.Division())+"\n"+
        	"Sin of "+input1+": "+String.format("%.2f",((GeometryCal) Cal).sin1())+"\n"+
        	"Sin of "+input2+": "+String.format("%.2f",((GeometryCal) Cal).sin2()));
        }
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}