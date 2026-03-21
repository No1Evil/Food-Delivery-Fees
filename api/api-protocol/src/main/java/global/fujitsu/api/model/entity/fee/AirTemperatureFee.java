package global.fujitsu.api.model.entity.fee;

import global.fujitsu.api.model.entity.EntityModel;
import lombok.NonNull;

import java.math.BigDecimal;

public record AirTemperatureFee(
    @NonNull BigDecimal minTemperature,
    @NonNull BigDecimal maxTemperature,
    @NonNull BigDecimal fee
) implements EntityModel {
}
