package global.fujitsu.api.entity.model.measurement;

import global.fujitsu.api.entity.model.EntityModel;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;

/** @param weatherPhenomenon weather type */
public record MeasurementEntity(
    @Nullable Long id,
    @NonNull Long regionId,
    @NonNull BigDecimal airTemperature,
    @NonNull BigDecimal windSpeed,
    // Maybe replace with WeatherType || PhenomenonType
    @NonNull String weatherPhenomenon,
    @NonNull Instant measuredAt
) implements EntityModel {

    public MeasurementEntity {
        if (weatherPhenomenon.isBlank()){
            throw new IllegalArgumentException("Weather phenomenon cannot be empty");
        }
    }

    public static MeasurementEntity fromResultSet(ResultSet rs) throws SQLException {
        return new MeasurementEntity(
            rs.getLong("id"),
            rs.getLong("region_id"),
            rs.getBigDecimal("air_temperature"),
            rs.getBigDecimal("wind_speed"),
            rs.getString("weather_phenomenon"),
            rs.getTimestamp("measured_at").toInstant()
        );
    }
}