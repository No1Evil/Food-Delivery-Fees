package global.fujitsu.api.domain.service;

import global.fujitsu.api.domain.model.region.RegionEntity;
import global.fujitsu.api.domain.service.base.BaseService;
import global.fujitsu.api.domain.model.region.RegionName;
import global.fujitsu.api.domain.model.region.WmoCode;

/**
 * Service for regions.
 */
public interface RegionService extends BaseService<RegionEntity> {

  /** {@return found region based on name} */
  RegionEntity findByRegionName(RegionName regionName);

  /** {@return found region based on WMO code} */
  RegionEntity findByWmoCode(WmoCode wmoCode);
}
