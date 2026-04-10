package global.fujitsu.api.domain.model.fee;

import global.fujitsu.api.domain.model.weather.WeatherPhenomenon;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

/**
 * Provides weather phenomenon fee entity.
 */
public record WeatherPhenomenonFeeEntity(
    @Nullable Long id,
    @Nullable Long vehicleTypeId,
    @Nullable WeatherPhenomenon weatherPhenomenon,
    @NonNull BigDecimal fee,
    @NonNull Boolean isAllowed)
    implements EntityFeeModel {

}
