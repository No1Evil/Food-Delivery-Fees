package global.fujitsu.api.domain.service;

import global.fujitsu.api.domain.model.measurement.MeasurementEntity;
import global.fujitsu.api.domain.service.base.BaseService;
import global.fujitsu.api.model.dto.request.create.CreateMeasurementRequest;
import global.fujitsu.api.model.dto.request.get.GetMeasurementRequest;
import global.fujitsu.api.model.dto.response.get.MeasurementResponse;
import java.time.Instant;

/** Service for weather measurements. */
public interface MeasurementService extends BaseService<MeasurementEntity> {

  /**
   * Finds a measurement by {@link GetMeasurementRequest}.
   *
   * @return found measurement
   */
  MeasurementEntity find(Long regionId, Instant timestamp);
}
