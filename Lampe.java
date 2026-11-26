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
    public void setFarbe(String neuFarbe)
    {
        farbe = neuFarbe;
    }
    public int getWatt()
    {
        return watt;
    }
    public void setWatt(int neuWatt)
    {
        watt = neuWatt;
    }
    public boolean getDimmbar()
    {
        return dimmbar;
    }
    public void setDimmbar(boolean neuDimmbar)
    {
        dimmbar = neuDimmbar;
    }

     public String getFarbton()
    {
        int i = farbe.indexOf(" ");

        if (i == -1)
        {
            return "Fehler: Kein Leerzeichen";
        }
        else
        {
            return farbe.substring(0, i);
        }
    }

    public String getFarbe()
    {
        int i = farbe.indexOf(" ");

        if (i == -1)
        {
            return "Fehler: Kein Leerzeichen";
        }
        else
        {
            return farbe.substring(i + 1);
        }
    }
}