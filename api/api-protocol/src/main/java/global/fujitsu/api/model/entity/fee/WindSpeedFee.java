package global.fujitsu.api.model.entity.fee;

import global.fujitsu.api.model.entity.vehicle.VehicleType;
import lombok.NonNull;

import java.math.BigDecimal;

public record WindSpeedFee(
    @NonNull VehicleType vehicleType,
    @NonNull BigDecimal minWindSpeed,
    @NonNull BigDecimal maxWindSpeed
) implements EntityFeeModel {

    public WindSpeedFee{
        vehicleType.validate();
    }
}
