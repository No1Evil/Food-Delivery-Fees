package global.fujitsu.api.model.dto.response.get;

import global.fujitsu.api.model.dto.response.base.GetResponse;
import global.fujitsu.api.model.weather.WeatherPhenomenon;
import lombok.NonNull;

import java.math.BigDecimal;

public record WeatherPhenomenonFeeResponse(
    @NonNull Long id,
    @NonNull Long vehicleTypeId,
    @NonNull String weatherPhenomenon,
    @NonNull WeatherPhenomenon weatherPhenomenon,
    @NonNull BigDecimal price,
    @NonNull Boolean isAllowed
) implements GetResponse {
}
