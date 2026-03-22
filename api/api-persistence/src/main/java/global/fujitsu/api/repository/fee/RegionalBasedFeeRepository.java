package global.fujitsu.api.repository.fee;

import global.fujitsu.api.entity.model.fee.RegionalBasedFeeEntity;
import global.fujitsu.api.model.dto.request.get.GetRegionalBasedFeeRequest;

public interface RegionalBasedFeeRepository extends FeeRepository<
    RegionalBasedFeeEntity,
    GetRegionalBasedFeeRequest
> {
}
