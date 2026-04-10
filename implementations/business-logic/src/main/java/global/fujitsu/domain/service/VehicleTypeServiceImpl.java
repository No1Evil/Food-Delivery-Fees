package global.fujitsu.domain.service;

import global.fujitsu.api.domain.exceptions.EntityNotFoundException;
import global.fujitsu.api.domain.model.vehicle.VehicleTypeEntity;
import global.fujitsu.api.domain.service.VehicleTypeService;
import global.fujitsu.api.domain.model.vehicle.VehicleType;
import global.fujitsu.api.repository.vehicle.VehicleTypeRepository;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** {@inheritDoc} */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class VehicleTypeServiceImpl implements VehicleTypeService {

  private final VehicleTypeRepository repository;

  @Override
  public VehicleTypeEntity findByName(@NonNull VehicleType vehicleType) {
    return repository.findByTypeName(vehicleType.value())
        .orElseThrow(() -> new EntityNotFoundException("No such vehicle {} found", vehicleType));
  }

  @Override
  @Transactional
  public Long create(@org.jspecify.annotations.NonNull VehicleTypeEntity entity) {
    return repository.save(entity);
  }

  @Override
  @Transactional
  public boolean delete(@NonNull Long id) {
    return repository.delete(id);
  }

  @Override
  public VehicleTypeEntity findById(@NonNull Long id) {
    return repository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("No such vehicle with id {} found", id)
    );
  }

  @Override
  public List<VehicleTypeEntity> findAll() {
    return repository.findAll();
  }
}
