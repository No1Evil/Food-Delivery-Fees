package global.fujitsu.api.repository.fee;

import global.fujitsu.api.entity.model.fee.WindSpeedFeeEntity;
import global.fujitsu.api.model.dto.request.get.GetWindSpeedFeeRequest;

public interface WindSpeedFeeRepository extends FeeRepository<
    WindSpeedFeeEntity,
    GetWindSpeedFeeRequest
> {
}
