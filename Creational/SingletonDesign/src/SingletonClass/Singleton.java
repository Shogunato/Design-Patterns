package SingletonClass;

public enum Singleton {

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
