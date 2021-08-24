public class Waterbottle {
    private int volume;

    public Waterbottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return volume;
    }

    public int drinkingWater(){
        return this.volume -= 10;
    }

    public int emptyWater(){
        return this.volume = 0;
    }

    public int resetVolume(){
        return this.volume = 100;
    }
}
