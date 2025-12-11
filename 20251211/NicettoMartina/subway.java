package objectos;
public class subway
{
    private String name;
    private int score=0;
    private int cumulative_distance = 0;
    private int energy=50;
    private boolean power_up = false;

    public subway (String name, int score, int cumulative_distance, int energy, boolean power_up) {
        this.name = name;
        System.out.println("El jugador se llama: " + name);
        this.score = score;
        this.cumulative_distance=cumulative_distance;
        this.energy=energy;
        this.power_up=power_up;
    } 
    
    public void run() {
        int increment = 2;

        if (power_up) {
            increment *= 3;
        }
        cumulative_distance += increment;

        for (int i = 0; i < increment; i++) {
            System.out.print("- ");
        }
        System.out.println("  --> Run: " + increment + " meters (Cumulative Distance: " + cumulative_distance + ")");
        
    }
     



    public void setname(String name)
    {
        this.name=name;
    }
    public void setscore(int score)
    {
        this.score=score;
    }
    public void setdistance(int cumulative_distance)
    {
        this.cumulative_distance=cumulative_distance;
    }
    public void setenergy(int energy)
    {
        this.energy=energy;
    }
    public void setpower(boolean power_up)
    {
        this.power_up=power_up;
    }

    public String getname()
    {
        return name;
    }
    public int getscore()
    {
        return score;
    }
    public int getdistance()
    {
        return cumulative_distance;
    }
    public int getenergy()
    {
        return energy;
    }
    public boolean getpower()
    {
        return power_up;
    }

  
}