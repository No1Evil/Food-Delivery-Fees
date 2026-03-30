import base.BaseServiceTest;
import global.fujitsu.api.model.dto.request.create.CreateRegionRequest;
import global.fujitsu.api.model.dto.response.get.RegionResponse;
import global.fujitsu.api.model.region.RegionName;
import global.fujitsu.api.model.region.WmoCode;
import global.fujitsu.domain.service.RegionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class RegionServiceImplTest extends BaseServiceTest<
    RegionServiceImpl, RegionResponse, CreateRegionRequest> {

  @Autowired
  public RegionServiceImplTest(RegionServiceImpl service) {
    setService(service);
  }

  @Override
  public CreateRegionRequest createRequest() {
    return new CreateRegionRequest(
        new RegionName("Tallinn"),
        new WmoCode("1212131")
    );
  }
}
