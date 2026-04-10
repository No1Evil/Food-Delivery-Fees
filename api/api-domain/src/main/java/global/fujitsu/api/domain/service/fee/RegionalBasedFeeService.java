package global.fujitsu.api.domain.service.fee;

import global.fujitsu.api.domain.model.fee.RegionalBasedFeeEntity;
import global.fujitsu.api.domain.service.base.BaseFeeService;
import global.fujitsu.api.model.dto.request.create.CreateRegionalBasedFeeRequest;
import global.fujitsu.api.model.dto.request.get.GetRegionalBasedFeeRequest;
import global.fujitsu.api.model.dto.response.get.RegionalBasedFeeResponse;
import global.fujitsu.api.model.region.RegionName;

/** Service for regional based fees. */
public interface RegionalBasedFeeService extends BaseFeeService<RegionalBasedFeeEntity, Long> {

}
