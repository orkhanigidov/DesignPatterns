package proxy.pattern.one;

public class RealImage implements Image{

    private String filename;
    
    public RealImage(String filename){
        this.filename = filename;
    }
    
    @Override
    public void display() {
    	loadFromDisk(filename);
        System.out.println("Displaying: " + filename);
    }
    
    private void loadFromDisk(String filename){
        System.out.println("Loading: " + filename);
    }
    
}
