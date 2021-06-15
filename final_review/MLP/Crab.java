package final_review.MLP;

public class Crab {
	
	    private String Type;
	    private double Heat, Noise, Powerconsumption, Bootspeed;

	    public Crab (String Type, double Heat, double Noise, double Powerconsumption, double Bootspeed)
	    {
	        this.Type = Type;
	        this.Heat = Heat;
	        this.Noise = Noise;
	        this.Powerconsumption = Powerconsumption;
	        this.Bootspeed = Bootspeed;
	    }

	    public String get_Type()
	    {
	        return Type;
	    }

	    public double get_Heat()
	    {
	        return Heat;
	    }

	    public double get_Noise()
	    {
	        return Noise;
	    }

	    public double get_Powerconsumption()
	    {
	        return Powerconsumption;
	    }

	    public double get_Bootspeed()
	    {
	        return Bootspeed;
	    }

	    public String toString ()
	    {
	        String result = "";

	        result += "\nType:"+ Type ;
	        result += "\nHeat: "+ Heat ;
	        result += "\nNoise: "+ Noise ;
	        result += "\nPowerconsumption: "+ Powerconsumption;
	        result += "\nBootspeed: "+ Bootspeed ;

	        return result;
	    }

	}
