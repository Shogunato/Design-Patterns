package SingletonClass;

//Singleton class itself, kinda simple with Enums...
public enum Singleton {

    //Constructor
    INSTANCE;
    
    private int i;

    public void show() {
        System.out.println(i);
    }

    public int getI() {
        return i;
    }
    
    public void setI(int i) {
        this.i = i;
    }
    
}
