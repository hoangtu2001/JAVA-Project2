package final_review.MLP;

public class max_width_node extends ANN_abstract_node {

    public double gender_identifying (Crab crab)
    {
        if ((seasonal == 1) && (crab.get_Powerconsumption() >= 45) && (crab.get_Powerconsumption() <= 92))
            return 1 ;//male
        else if ((seasonal == 0) && (crab.get_Powerconsumption() >= 72.5) && (crab.get_Powerconsumption() <= 135))
            return 1;
        else
            return 0 ;//female
    }
}