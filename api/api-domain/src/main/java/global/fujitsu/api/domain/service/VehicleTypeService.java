package global.fujitsu.api.domain.service;

import global.fujitsu.api.domain.model.vehicle.VehicleTypeEntity;
import global.fujitsu.api.domain.service.base.BaseService;
import global.fujitsu.api.domain.model.vehicle.VehicleType;
import lombok.NonNull;

/**
 * Service for vehicle types.
 */
public interface VehicleTypeService extends BaseService<VehicleTypeEntity> {

  /** {@return found vehicle type} */
  VehicleTypeEntity findByName(@NonNull VehicleType vehicleType);
}
