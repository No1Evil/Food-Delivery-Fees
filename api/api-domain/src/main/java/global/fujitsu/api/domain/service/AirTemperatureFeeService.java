package global.fujitsu.api.domain.service;

import global.fujitsu.api.domain.dto.request.create.CreateAirTemperatureFeeRequest;
import global.fujitsu.api.domain.dto.response.get.AirTemperatureFeeResponse;
import global.fujitsu.api.domain.service.base.BaseService;

public interface AirTemperatureFeeService
    extends BaseService<AirTemperatureFeeResponse, CreateAirTemperatureFeeRequest> {
}
