package Final;

/**
 * Created by kartikkapur on 8/12/17.
 */
public class Hall {
    public final Room room1;
    public final Room room2;
    public final double length;
    public Hall(Room r1, Room r2, double length){
        this.room1 = r1;
        this.room2 = r2;
        this.length = length;
    }
    public Room from(){
        return room1;
    }
    public Room to(){
        return room2;
    }
    public double howFar(){
        return this.length;
    }
}
