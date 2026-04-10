package global.fujitsu.api.protocol.dto.request.get;

import global.fujitsu.api.protocol.dto.request.base.GetFeeRequest;
import jakarta.validation.constraints.NotNull;

/**
 * Request to calculate a fee based on weather phenomenon.
 */
public record GetWeatherPhenomenonFeeRequest(
    @NotNull(message = "The vehicle type is missing") Long vehicleTypeId,
    @NotNull(message = "The weather phenomenon is missing") String weatherPhenomenon)
    implements GetFeeRequest {

}
