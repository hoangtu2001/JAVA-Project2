package final_review.MLP;

import java.util.ArrayList;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ANN_Visualization extends Application
{	    	
	public final String SEASON = "Day";
	
    public void start(Stage primaryStage) 
    {        
    	
    	//---------------------------------input items---------------------------------  	    	
    	Image crab_img = new Image("final_review\\MLP\\crab_image.jpg");
        ImageView crab_imgView = new ImageView(crab_img);
        crab_imgView.setX(100);
        crab_imgView.setY(100);
        crab_imgView.setFitWidth(70);
        crab_imgView.setPreserveRatio(true);
        
        Text crab_imgText = new Text(105, 175,"");
        StringProperty crab_imgTextString = new SimpleStringProperty("gaming laptop");
        crab_imgText.textProperty().bind(crab_imgTextString);
        
        Image season_img = new Image("final_review\\MLP\\season_image.jpg");
        ImageView season_imgView = new ImageView(season_img);
        season_imgView.setX(100);
        season_imgView.setY(320);
        season_imgView.setFitWidth(70);
        season_imgView.setPreserveRatio(true);
        
        Text season_imgText = new Text(115, 400,"");
        StringProperty season_imgTextString = new SimpleStringProperty("time of day");
        season_imgText.textProperty().bind(season_imgTextString);        
        
        Group inputItems = new Group (crab_imgView, crab_imgText, season_imgView, season_imgText);       
        
        Line crab2inputnode = new Line(170, 140, 275, 240);
        crab2inputnode.setStroke(Color.WHITE);
        Line season2inputnode = new Line(170, 345, 275, 240);   
        season2inputnode.setStroke(Color.WHITE);
        
        Group inputItems2inputLayer = new Group (crab2inputnode, season2inputnode);
    	
    	
    	//---------------------------------input layer---------------------------------
        Circle inputNode = new Circle(300, 240, 20);
        inputNode.setStroke(Color.BLACK);
        inputNode.setFill(Color.WHITE);     
        
        Text inputNodeText = new Text(270, 275,"");
        StringProperty inputNodeTextString = new SimpleStringProperty("input node");
        inputNodeText.textProperty().bind(inputNodeTextString);
        
        Group inputLayer = new Group (inputNode, inputNodeText);
        
        Line input2node1 = new Line(325, 240, 525, 80);  
        Line input2node2 = new Line(325, 240, 525, 180);
        Line input2node3 = new Line(325, 240, 525, 280);
        Line input2node4 = new Line(325, 240, 525, 380);        
        Group inputLayer2middleLayer = new Group (input2node1, input2node2, input2node3, input2node4);
        
        
        //---------------------------------processing layer---------------------------------
        Circle processingNode1 = new Circle(550, 80, 20);
        processingNode1.setStroke(Color.BLACK);
        processingNode1.setFill(Color.WHITE);   
        
        Circle processingNode2 = new Circle(550, 180, 20);
        processingNode2.setStroke(Color.BLACK);
        processingNode2.setFill(Color.WHITE);   
        
        Circle processingNode3 = new Circle(550, 280, 20);
        processingNode3.setStroke(Color.BLACK);
        processingNode3.setFill(Color.WHITE);   
        
        Circle processingNode4 = new Circle(550, 380, 20);
        processingNode4.setStroke(Color.BLACK);
        processingNode4.setFill(Color.WHITE);  
        
        Text processingNode1Text = new Text(525, 115, "");
        StringProperty processingNode1TextString = new SimpleStringProperty("node 1");
        processingNode1Text.textProperty().bind(processingNode1TextString);
        
        Text processingNode2Text = new Text(525, 215, "");
        StringProperty processingNode2TextString = new SimpleStringProperty("node 2");
        processingNode2Text.textProperty().bind(processingNode2TextString);
        
        Text processingNode3Text = new Text(525, 315, "");
        StringProperty processingNode3TextString = new SimpleStringProperty("node 3");
        processingNode3Text.textProperty().bind(processingNode3TextString);
        
        Text processingNode4Text = new Text(525, 415, "");       
        StringProperty processingNode4TextString = new SimpleStringProperty("node 4");
        processingNode4Text.textProperty().bind(processingNode4TextString);        
        
        Group processingLayer = new Group (processingNode1, processingNode2, processingNode3, processingNode4, 
        					processingNode1Text, processingNode2Text, processingNode3Text, processingNode4Text);
        
        Line node12output = new Line(575, 80, 775, 240);  
        Line node22output = new Line(575, 180, 775, 240);
        Line node32output = new Line(575, 280, 775, 240);
        Line node42output = new Line(575, 380, 775, 240);
        Group middleLayer2outputLayer = new Group (node12output, node22output, node32output, node42output);
        
        
        //---------------------------------output layer----------------------------------------
        Circle outputNode = new Circle(800, 240, 20);
        outputNode.setStroke(Color.BLACK);
        outputNode.setFill(Color.WHITE);   
        
        Text outputNodeText = new Text(770, 275, "");
        StringProperty outputNodeTextString = new SimpleStringProperty("output node");
        outputNodeText.textProperty().bind(outputNodeTextString);
        
        Group outputLayer = new Group (outputNode, outputNodeText);
        
        
        //---------------------------------Run button----------------------------------------
        
    	Button runButton = new Button("Run!!");
    	runButton.setLayoutX(500);
    	runButton.setLayoutY(450);    	
    	runButton.setOnAction((event) -> {
    		Crab blueCrab = new Crab ("Gaming Laptop", 53,33,46,16.0);
    		
    		//input layers
    		season_node input_node = new season_node(SEASON);
    		input_node.gender_identifying(blueCrab);
    		
    		crab_imgTextString.setValue((blueCrab.toString()));
    		season_imgTextString.setValue(SEASON);
    		inputNodeTextString.setValue(""+input_node.gender_identifying(blueCrab));
    		
    		crab2inputnode.setStroke(Color.BLACK);
    		season2inputnode.setStroke(Color.BLACK);
    		
    		//processing layer
    		front_lip_node node1 = new front_lip_node();
    		body_depth_node node2 = new body_depth_node();
    		max_width_node node3 = new max_width_node();
    		midline_length_node node4 = new midline_length_node();
    		
    		ArrayList<ANN_abstract_node> processing_nodes = new ArrayList<ANN_abstract_node>();
    		processing_nodes.add(node1);
    		processing_nodes.add(node2);
    		processing_nodes.add(node3);
    		processing_nodes.add(node4);
    		
    		processingNode1TextString.setValue(""+node1.gender_identifying(blueCrab));
    		processingNode2TextString.setValue(""+node2.gender_identifying(blueCrab));
    		processingNode3TextString.setValue(""+node3.gender_identifying(blueCrab));
    		processingNode4TextString.setValue(""+node4.gender_identifying(blueCrab));
    		
    		//output layer		
    		gender_identifying_node output_node = new gender_identifying_node(processing_nodes);
    		
    		outputNodeTextString.setValue(""+ output_node.gender_identifying(blueCrab));    
    		
    		Alert answerDialog = new Alert(AlertType.INFORMATION);
            answerDialog.setHeaderText(null);
    		
    		if ( output_node.gender_identifying(blueCrab) < 0.5)
    		{    			
                answerDialog.setContentText("it's more likely a gaming laptop");
                answerDialog.showAndWait();    			
    		}
    		else if ( output_node.gender_identifying(blueCrab) > 0.5)
    		{
    			answerDialog.setContentText("it's more likely a economy laptop");
                answerDialog.showAndWait();     			
    		}
    		else 
    		{
    			answerDialog.setContentText("unable to identify");
    	        answerDialog.showAndWait();     
    		}
        });
    	

    	//---------------------------------scene display---------------------------------    	
        Group display = new Group(runButton, inputItems, inputItems2inputLayer, inputLayer, inputLayer2middleLayer, processingLayer, middleLayer2outputLayer, outputLayer);      
        
        Group root = new Group(display);
        Scene scene = new Scene(root, 1000, 500);

        primaryStage.setTitle("MLP");
        primaryStage.setScene(scene);
        primaryStage.show();
    }    
  
    public static void main(String[] args)
    {
        launch(args);
    }
}