package global.fujitsu.domain.service;

import global.fujitsu.api.domain.exceptions.EntityNotFoundException;
import global.fujitsu.api.domain.model.region.RegionEntity;
import global.fujitsu.api.domain.service.RegionService;
import global.fujitsu.api.model.region.RegionName;
import global.fujitsu.api.model.region.WmoCode;
import global.fujitsu.api.repository.region.RegionRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** {@inheritDoc} */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {

  private final RegionRepository repository;

  @Override
  public RegionEntity findByRegionName(RegionName regionName) {
    return repository.findByName(regionName)
        .orElseThrow(
            () -> new EntityNotFoundException("Region with name {} not found", regionName.value()));
  }

  @Override
  public RegionEntity findByWmoCode(WmoCode wmoCode) {
    return repository.findByWmoCode(wmoCode)
        .orElseThrow(
            () -> new EntityNotFoundException("Region with name {} not found", wmoCode.value()));
  }

  @Override
  @Transactional
  public Long create(@NonNull RegionEntity entity) {
    return repository.save(entity);
  }

  @Override
  public boolean delete(@NonNull Long id) {
    return repository.delete(id);
  }

  @Override
  public RegionEntity findById(@NonNull Long id) {
    return repository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("Region with id {} not found", id)
    );
  }

  @Override
  public List<RegionEntity> findAll() {
    return repository.findAll();
  }
}
