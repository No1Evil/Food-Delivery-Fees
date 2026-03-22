package global.fujitsu.api.repository.fee;

import global.fujitsu.api.entity.model.fee.WeatherPhenomenonFeeEntity;
import global.fujitsu.api.model.dto.request.get.GetWeatherPhenomenonFeeRequest;

public interface WeatherPhenomenonFeeRepository extends FeeRepository<
    WeatherPhenomenonFeeEntity,
    GetWeatherPhenomenonFeeRequest
> {
}
