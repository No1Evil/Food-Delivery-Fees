import base.BaseJdbcDaoTest;
import global.fujitsu.api.domain.model.measurement.MeasurementEntity;
import global.fujitsu.api.model.weather.WeatherPhenomenon;
import global.fujitsu.persistence.dao.impl.JdbcMeasurementDao;
import java.math.BigDecimal;
import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.JdbcTest;
import org.springframework.context.annotation.Import;

@JdbcTest
@Import(JdbcMeasurementDao.class)
public class JdbcMeasurementDaoTest extends BaseJdbcDaoTest<JdbcMeasurementDao, MeasurementEntity> {

  @Autowired
  protected JdbcMeasurementDaoTest(JdbcMeasurementDao repository) {
    super(repository);
  }

  @Override
  protected MeasurementEntity createTestEntity() {
    return new MeasurementEntity(
        null,
        1L,
        BigDecimal.ONE,
        BigDecimal.ONE,
        new WeatherPhenomenon("rain"),
        Instant.now()
    );
  }
}
