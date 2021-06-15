package final_review.MLP;

public class season_node extends ANN_abstract_node {
    private String season;

    private String time;

    public season_node (String time)
    {
        this.time = time;
    }

    public double gender_identifying(Crab laptop)
    {
        if (time == "Day")
        {
            seasonal = 1;
            return 1;
        }
        else // time == "Night"
        {
            seasonal = 0;
            return 0;
        }
    }
}