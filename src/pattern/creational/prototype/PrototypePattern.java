package pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable {
    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();
    }

    public Vehicle(List<String> list) {
        this.vehicleList = list;
    }

    public void insertData() {
        vehicleList.add("Honda");
        vehicleList.add("Audi");
        vehicleList.add("Hyundai");
        vehicleList.add("Maruti");
        vehicleList.add("Renault");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();

        for (String s : this.getVehicleList()) {
            tempList.add(s);
        }

        return new Vehicle(tempList);
    }
}

public class PrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle a = new Vehicle();
        a.insertData();
        System.out.println(a.getVehicleList());     //[Honda, Audi, Hyundai, Maruti, Renault]

        Vehicle b = (Vehicle) a.clone();
        List<String> list = b.getVehicleList();
        list.add("Tata");
        System.out.println(list);   //[Honda, Audi, Hyundai, Maruti, Renault, Tata]

        b.getVehicleList().remove("Audi");
        System.out.println(list);   //[Honda, Hyundai, Maruti, Renault, Tata]

        System.out.println(a.getVehicleList()); //[Honda, Audi, Hyundai, Maruti, Renault]
    }
}
