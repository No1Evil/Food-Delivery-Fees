package global.fujitsu.api.domain.model.fee;

import java.math.BigDecimal;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

/**
 * Provides air temperature fee entity.
 */
public record AirTemperatureFeeEntity(
    @Nullable Long id,
    @Nullable Long vehicleTypeId,
    @NonNull BigDecimal minTemperature,
    @NonNull BigDecimal maxTemperature,
    @NonNull BigDecimal fee,
    @NonNull Boolean isAllowed)
    implements EntityFeeModel {

}
