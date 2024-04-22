package Models;

/**
 *
 * @author Karl Schuckmann
 */
public class InHouse extends Part {

    private int machineId;

    //Constructor
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        super(id, name, price, stock, min, max);
        this.machineId = machineId;
    }

    //Getter
    public int getMachineId() {
        return machineId;
    }

    //Setter
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}