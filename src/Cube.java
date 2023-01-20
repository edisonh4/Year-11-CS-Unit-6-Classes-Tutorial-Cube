public class Cube {
    // properties
    private int side;

    public Cube(){
        side=1;
    }
    public Cube(int s) {
        side = s;
        if (side <1)
            throw new IllegalArgumentException();
    }
    public int getSide(){return side;}
    public void setSide(int side){
        this.side = side;
        if (side < 1)
            throw new IllegalArgumentException();
    }
    public int getSurfaceArea(){return side*side*6;}
    public int getVolume(){return side*side*side;}

    public String toString(){return "side length: " + side;}
}
