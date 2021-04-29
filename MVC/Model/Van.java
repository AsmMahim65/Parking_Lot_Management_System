package Model;

import Model.*;
import View.*;
import Controller.*;

public class Van extends Vehicle {

    //this class includes all the methods to implement functions related to van

    private Double cargoVolume;

    public Double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(Double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    //abstract methods which are in the vehicle class
    public String getVehicleType() { return vehicleType;}

    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType;}

    public String getIdPlate() {return idPlate;}

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }


}
