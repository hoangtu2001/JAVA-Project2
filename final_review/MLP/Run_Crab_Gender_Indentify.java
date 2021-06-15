package final_review.MLP;

import java.util.ArrayList;

public class Run_Crab_Gender_Indentify {

    public static void main (String[] args)
    {
        Crab blueCrab = new Crab ("blue crab", 16,40,39,18);

        //input layer
        season_node input_node = new season_node("Spring");
        input_node.gender_identifying(blueCrab);


        //processing layer
        front_lip_node node1 = new front_lip_node();
        max_width_node node2 = new max_width_node();
        midline_length_node node3 = new midline_length_node();
        body_depth_node node4 = new body_depth_node();

        ArrayList<ANN_abstract_node> processing_nodes = new ArrayList<ANN_abstract_node>();
        processing_nodes.add(node1);
        processing_nodes.add(node2);
        processing_nodes.add(node3);
        processing_nodes.add(node4);

        //output layer
        gender_identifying_node output_node = new gender_identifying_node(processing_nodes);

        System.out.println("average_probability: " + output_node.gender_identifying(blueCrab));
        if ( output_node.gender_identifying(blueCrab) < 0.5)
            System.out.println("it's more likely to be a female crab");
        else if ( output_node.gender_identifying(blueCrab) > 0.5)
            System.out.println("it's more likely to be a male crab");
        else 
            System.out.println("unable to identify");
    }
}