package global.fujitsu.api.entity.model.measurement;

import global.fujitsu.api.entity.model.EntityModel;
import global.fujitsu.api.model.weather.WeatherPhenomenon;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
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