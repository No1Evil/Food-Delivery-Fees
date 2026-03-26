package fee;

import base.BaseJdbcBasedFeeRepositoryTest;
import global.fujitsu.api.entity.model.fee.RegionalBasedFeeEntity;
import global.fujitsu.api.model.dto.request.get.GetRegionalBasedFeeRequest;
import global.fujitsu.persistence.dao.impl.fee.JdbcRegionalBasedFeeDao;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

@JdbcTest
@Sql("/sql/regions_and_vehicles_references.sql")
@Import(JdbcRegionalBasedFeeDao.class)
public class JdbcRegionalBasedFeeDaoTest
    extends BaseJdbcBasedFeeRepositoryTest<
    JdbcRegionalBasedFeeDao, GetRegionalBasedFeeRequest,RegionalBasedFeeEntity> {

  @Autowired
  public JdbcRegionalBasedFeeDaoTest(
      JdbcRegionalBasedFeeDao repository
  ) {
    super(repository);
  }

  @Override
  public GetRegionalBasedFeeRequest createPassingRequest() {
    return new GetRegionalBasedFeeRequest(1L, 1L);
  }

  @Override
  public GetRegionalBasedFeeRequest createOutOfBoundRequest() {
    return new GetRegionalBasedFeeRequest(2L, 1L);
  }

  @Override
  protected RegionalBasedFeeEntity createTestEntity() {
    return new RegionalBasedFeeEntity(null, 1L, 1L, BigDecimal.valueOf(5L), true);
  }
}
