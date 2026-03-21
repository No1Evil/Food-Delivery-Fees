package global.fujitsu.api.model.entity.measurement;

import global.fujitsu.api.model.entity.EntityModel;
import global.fujitsu.api.model.region.RegionName;
import lombok.NonNull;

import java.math.BigDecimal;

/** @param weatherPhenomenon weather type */
public record Measurement(
    @NonNull RegionName regionName,
    @NonNull BigDecimal temperature,
    @NonNull BigDecimal windSpeed,
    // Maybe replace with WeatherType || PhenomenonType
    @NonNull String weatherPhenomenon
) implements EntityModel {

    public Measurement{
        if (weatherPhenomenon.isBlank()){
            throw new IllegalArgumentException("Weather phenomenon cannot be empty");
        }
    }
}