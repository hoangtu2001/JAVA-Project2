package final_review.MLP;

public class front_lip_node extends ANN_abstract_node {

    public double gender_identifying (Crab crab)
    {
        if ((seasonal == 1) && (crab.get_Heat() >= 58) && (crab.get_Heat() <= 70))
            return 1 ;//male
        else if ((seasonal == 0) && (crab.get_Heat() >= 52) && (crab.get_Heat() <= 65.5))
            return 1;
        else
            return 0 ;//female
    }
}