package global.fujitsu.api.repository.fee;

import global.fujitsu.api.entity.model.fee.AirTemperatureFeeEntity;
import global.fujitsu.api.model.dto.request.get.GetAirTemperatureFeeRequest;

public interface AirTemperatureFeeRepository extends FeeRepository<
    AirTemperatureFeeEntity,
    GetAirTemperatureFeeRequest
> {
}
