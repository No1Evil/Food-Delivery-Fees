package global.fujitsu.api.domain.service;

import global.fujitsu.api.model.dto.request.get.TotalFeeRequest;
import global.fujitsu.api.model.dto.response.get.TotalFeeResponse;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * Service for total fee.
 */
public interface TotalFeeService {

  /** {@return total fee} */
  BigDecimal getTotalFee(Long regionId, Long vehicleTypeId, Instant timestamp);
}
