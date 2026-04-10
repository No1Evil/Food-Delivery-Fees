package global.fujitsu.api.domain.service.base;

import global.fujitsu.api.domain.model.EntityModel;
import global.fujitsu.api.model.dto.request.base.CreateRequest;
import global.fujitsu.api.model.dto.request.base.GetFeeRequest;
import global.fujitsu.api.model.dto.response.base.GetResponse;
import global.fujitsu.api.model.fee.FeeResult;

/**
 * Provides a base fee service for fee calculations.
 *
 * @param <ResponseT> implementation class of {@link GetResponse}
 * @param <CreateRequestT> implementation class of {@link CreateRequest}
 * @param <GetRequestT> implementation of {@link GetFeeRequest}
 */
public interface BaseFeeService<E extends EntityModel, C> extends BaseService<E> {

  /**
   * Provides the fee based on provided request.
   *
   * @return base fee based on request
   */
  FeeResult getBaseFee(Long vehicleTypeId, C condition);
}
