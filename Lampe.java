public class Lampe
{
    private String farbe = "UNKN";
    private int watt = 1;
    private boolean dimmbar = false;
    
    public Lampe(String neuFarbe, int neuWatt, boolean neuDimmbar)
    {
        farbe = neuFarbe;
        watt = neuWatt;
        dimmbar = neuDimmbar;
    }
}