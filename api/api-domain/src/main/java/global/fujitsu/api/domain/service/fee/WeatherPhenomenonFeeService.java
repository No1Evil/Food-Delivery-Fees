package global.fujitsu.api.domain.service.fee;

import global.fujitsu.api.domain.service.base.BaseFeeService;
import global.fujitsu.api.model.dto.request.create.CreateWeatherPhenomenonFeeRequest;
import global.fujitsu.api.model.dto.request.get.GetWeatherPhenomenonRequest;
import global.fujitsu.api.model.dto.response.get.WeatherPhenomenonFeeResponse;
import global.fujitsu.api.domain.service.base.BaseService;
import global.fujitsu.api.model.fee.FeeResult;
import global.fujitsu.api.model.vehicle.VehicleType;
import lombok.NonNull;

public interface WeatherPhenomenonFeeService extends BaseFeeService<
    WeatherPhenomenonFeeResponse,
    CreateWeatherPhenomenonFeeRequest,
    GetWeatherPhenomenonRequest
> {
}
