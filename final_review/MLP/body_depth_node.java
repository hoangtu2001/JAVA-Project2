package final_review.MLP;

public class body_depth_node extends ANN_abstract_node {

    public double gender_identifying (Crab crab)
    {
        if ((seasonal == 1) && (crab.get_Noise() >= 58) && (crab.get_Noise() <= 70))
            return 1 ;//male
        else if ((seasonal == 0) && (crab.get_Noise() >= 52) && (crab.get_Noise() <= 65.5))
            return 1;
        else
            return 0 ;//female
    }
}