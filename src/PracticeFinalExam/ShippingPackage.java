package PracticeFinalExam;

public class ShippingPackage {
    private int id;
    private String destination;
    private int height;
    private int width;
    private int depth;
    private double weight;
    private static int NumberOfPackage;

    public int getNumberOfPackage(){
        return NumberOfPackage;
    }

    ShippingPackage(int id, String destination, int height, int width, int depth, double weight){
        this.id = id;
        this.destination = destination;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = width;
        NumberOfPackage++;
    }

    ShippingPackage(){
        NumberOfPackage++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height<=0){
            this.height = 1;
        }
        else this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0){
            this.width = 1;
        }
        else this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        if(depth<=0){
            this.depth = 1;
        }
        else this.depth = depth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private int computeVolume(){
        return  getHeight ()*getDepth ()*getWidth ();
    }

    public double computeShipping(){
        return computeVolume ()*0.001+0.5*getWeight ();
    }
}
