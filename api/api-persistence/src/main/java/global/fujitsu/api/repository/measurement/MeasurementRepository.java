package global.fujitsu.api.repository.measurement;

import global.fujitsu.api.entity.model.measurement.MeasurementEntity;
import global.fujitsu.api.entity.model.region.RegionEntity;
import global.fujitsu.api.model.region.RegionName;
import global.fujitsu.api.repository.Repository;
import lombok.NonNull;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface MeasurementRepository extends Repository<MeasurementEntity> {
    /** {@return actual measurement at the specified time }  */
    Optional<MeasurementEntity> findLatest(RegionName regionName, Instant timestamp);

    /* TODO
    /** {@return found measurement list}  /
    List<MeasurementEntity> findAllByTime(Instant from, Instant to);
    */
}
