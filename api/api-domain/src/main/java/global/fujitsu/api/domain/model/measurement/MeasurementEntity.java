package global.fujitsu.api.domain.model.measurement;

import global.fujitsu.api.domain.model.EntityModel;
import global.fujitsu.api.domain.model.weather.WeatherPhenomenon;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Contains weather measurements associated with region.
 */
public record MeasurementEntity(
    @Nullable Long id,
    @NonNull Long regionId,
    @NonNull BigDecimal airTemperature,
    @NonNull BigDecimal windSpeed,
    // Maybe replace with WeatherType || PhenomenonType
    @NonNull WeatherPhenomenon weatherPhenomenon,
    @NonNull Instant measuredAt)
    implements EntityModel {

}