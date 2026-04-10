package global.fujitsu.domain.service;

import global.fujitsu.api.domain.exceptions.EntityNotFoundException;
import global.fujitsu.api.domain.model.measurement.MeasurementEntity;
import global.fujitsu.api.domain.service.MeasurementService;
import global.fujitsu.api.repository.measurement.MeasurementRepository;
import java.time.Instant;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/** {@inheritDoc} */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MeasurementServiceImpl implements MeasurementService {

  private final MeasurementRepository repository;

  @Override
  public Long create(@org.jspecify.annotations.NonNull MeasurementEntity entity) {
    return 0L;
  }

  @Override
  public boolean delete(@NonNull Long id) {
    return repository.delete(id);
  }

  @Override
  public MeasurementEntity findById(@NonNull Long id) {
    return repository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("Measurement with id {} not found", id)
    );
  }

  @Override
  public List<MeasurementEntity> findAll() {
    return repository.findAll();
  }

  @Override
  public MeasurementEntity find(Long regionId, Instant timestamp) {
    return repository.find(regionId, timestamp)
        .orElseThrow(() -> new EntityNotFoundException(
            "Measurement not found for region {} and timestamp {}", regionId, timestamp
        ));
  }
}
