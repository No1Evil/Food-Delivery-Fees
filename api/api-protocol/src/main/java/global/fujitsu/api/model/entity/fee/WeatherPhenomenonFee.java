package global.fujitsu.api.model.entity.fee;

import global.fujitsu.api.model.entity.EntityModel;
import global.fujitsu.api.model.entity.vehicle.VehicleType;
import lombok.NonNull;

import java.math.BigDecimal;

public record WeatherPhenomenonFee(
    @NonNull VehicleType vehicleType,
    @NonNull String weatherPhenomenon,
    @NonNull BigDecimal price
) implements EntityModel {

    public WeatherPhenomenonFee{
        vehicleType.validate();
    }
}
