import base.BaseJdbcDaoTest;
import global.fujitsu.api.entity.model.region.RegionEntity;
import global.fujitsu.api.model.region.RegionName;
import global.fujitsu.api.model.region.WmoCode;
import global.fujitsu.persistence.dao.impl.JdbcRegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

@JdbcTest
@Sql(scripts = "classpath:scripts/cleanup_regions.sql")
@Import(JdbcRegionDao.class)
public class JdbcRegionDaoTest
    extends BaseJdbcDaoTest<JdbcRegionDao, RegionEntity> {

  @Autowired
  protected JdbcRegionDaoTest(JdbcRegionDao repository) {
    super(repository);
  }

  @Override
  protected RegionEntity createTestEntity() {
    return new RegionEntity(null, new RegionName("Tallinn"), new WmoCode("1200320"));
  }
}
