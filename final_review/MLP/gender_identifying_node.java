package final_review.MLP;

import java.util.ArrayList;

public class gender_identifying_node extends ANN_abstract_node {

    private ArrayList<ANN_abstract_node> middle_layer_nodes = new ArrayList<ANN_abstract_node>();

    public gender_identifying_node (ArrayList<ANN_abstract_node> nodesArray)
    {
        middle_layer_nodes = nodesArray;
    }

    public double gender_identifying (Crab crab)
    {
        double sum =0;
        ANN_abstract_node casting_holer;

        for (int i=0; i< middle_layer_nodes.size(); i++)
        {
            if (middle_layer_nodes.get(i) instanceof front_lip_node)
            {
                casting_holer = (front_lip_node)middle_layer_nodes.get(i);
                sum += casting_holer.gender_identifying(crab);
            }
            if (middle_layer_nodes.get(i) instanceof max_width_node)
            {
                casting_holer = (max_width_node)middle_layer_nodes.get(i);
                sum += casting_holer.gender_identifying(crab);
            }
            if (middle_layer_nodes.get(i) instanceof midline_length_node)
            {
                casting_holer = (midline_length_node)middle_layer_nodes.get(i);
                sum += casting_holer.gender_identifying(crab);
            }
            if (middle_layer_nodes.get(i) instanceof body_depth_node)
            {
                casting_holer = (body_depth_node)middle_layer_nodes.get(i);
                sum += casting_holer.gender_identifying(crab);
            }
        }

        double average_probability = (sum/middle_layer_nodes.size()); 

        return average_probability;
    }
}