package global.fujitsu.api.model.entity.vehicle;

import global.fujitsu.api.model.entity.EntityModel;

public enum VehicleType implements EntityModel {
    UNSPECIFIED,
    CAR,
    SCOOTER,
    BIKE;

    public void validate(){
        validate("Vehicle Type must be specified");
    }

    public void validate(String errorMessage){
        if (this == UNSPECIFIED){
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
