package final_review.MLP;

public class midline_length_node extends ANN_abstract_node {

    public double gender_identifying (Crab crab)
    {
        if ((seasonal == 1) && (crab.get_Bootspeed() >= 6) && (crab.get_Bootspeed() <= 12))
            return 1 ;//male
        else if ((seasonal == 0) && (crab.get_Bootspeed() >= 8.6) && (crab.get_Bootspeed() <= 15))
            return 1;
        else
            return 0 ;//female
    }
}