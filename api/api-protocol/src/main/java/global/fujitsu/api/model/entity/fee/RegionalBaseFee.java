package global.fujitsu.api.model.entity.fee;

import global.fujitsu.api.model.entity.EntityModel;
import global.fujitsu.api.model.region.RegionName;
import global.fujitsu.api.model.entity.vehicle.VehicleType;
import lombok.NonNull;

import java.math.BigDecimal;

public record RegionalBaseFee(
    @NonNull RegionName regionName,
    @NonNull VehicleType vehicleType,
    @NonNull BigDecimal fee
) implements EntityModel {

    public RegionalBaseFee{
        vehicleType.validate();
    }
}
