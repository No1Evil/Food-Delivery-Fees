package global.fujitsu.api.model.dto.request.get;

import global.fujitsu.api.model.dto.request.base.GetFeeRequest;
import global.fujitsu.api.model.region.RegionName;
import lombok.NonNull;

public record GetRegionalFeeRequest(
    @NonNull Long vehicleTypeId,
    @NonNull RegionName regionName
) implements GetFeeRequest {
}
