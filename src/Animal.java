public class Animal {
    private int appetit;
    String name;
    boolean hungry = true;


    protected int setAppetit(int app) {
        this.appetit = app;
        return appetit;
    }

    protected int getAppetit() {
        return appetit;
    }

    protected boolean getHungry() {

        return hungry;
    }

    protected boolean setHungry(boolean hungry) {
        this.hungry = hungry;
        return hungry;
    }

    public void Eat() {
        if (Bowl.quantity >= appetit) {
            Bowl.quantity -= appetit;
            setHungry(false);
        }
    }

}
