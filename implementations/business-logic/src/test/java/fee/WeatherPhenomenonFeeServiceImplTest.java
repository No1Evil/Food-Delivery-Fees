package fee;

import base.BaseFeeServiceTest;
import global.fujitsu.api.model.dto.request.create.CreateWeatherPhenomenonFeeRequest;
import global.fujitsu.api.model.dto.request.get.GetWeatherPhenomenonFeeRequest;
import global.fujitsu.api.model.dto.response.get.WeatherPhenomenonFeeResponse;
import global.fujitsu.api.model.weather.WeatherPhenomenon;
import global.fujitsu.domain.service.fee.WeatherPhenomenonFeeServiceImpl;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;

public class WeatherPhenomenonFeeServiceImplTest
    extends BaseFeeServiceTest<
    WeatherPhenomenonFeeServiceImpl,
    WeatherPhenomenonFeeResponse,
    CreateWeatherPhenomenonFeeRequest,
    GetWeatherPhenomenonFeeRequest> {

  @Autowired
  public WeatherPhenomenonFeeServiceImplTest(WeatherPhenomenonFeeServiceImpl service) {
    super(service);
  }

  @Override
  protected GetWeatherPhenomenonFeeRequest getFeeRequest() {
    return new GetWeatherPhenomenonFeeRequest(1L, new WeatherPhenomenon("rain"));
  }

  @Override
  protected GetWeatherPhenomenonFeeRequest restrictionInitiator() {
    return new GetWeatherPhenomenonFeeRequest(1L, new WeatherPhenomenon("storm"));
  }

  @Override
  protected CreateWeatherPhenomenonFeeRequest restriction() {
    return new CreateWeatherPhenomenonFeeRequest(
        1L,
        new WeatherPhenomenon("storm"),
        BigDecimal.ZERO,
        false
    );
  }

  @Override
  protected CreateWeatherPhenomenonFeeRequest createRequest() {
    return new CreateWeatherPhenomenonFeeRequest(
        1L,
        new WeatherPhenomenon("rain"),
        BigDecimal.ZERO,
        true
    );
  }
}
