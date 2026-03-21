package global.fujitsu.api.domain.service;

import global.fujitsu.api.domain.dto.request.BaseFeeRequest;
import global.fujitsu.api.domain.dto.response.BaseFeeResponse;

public interface BaseFeeService {
    BaseFeeResponse getBaseFee(BaseFeeRequest request);
}
