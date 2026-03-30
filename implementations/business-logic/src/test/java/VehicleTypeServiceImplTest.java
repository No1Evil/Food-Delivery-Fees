import base.BaseServiceTest;
import global.fujitsu.api.model.dto.request.create.CreateVehicleTypeRequest;
import global.fujitsu.api.model.dto.response.get.VehicleTypeResponse;
import global.fujitsu.api.model.vehicle.VehicleType;
import global.fujitsu.domain.service.VehicleTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleTypeServiceImplTest
extends BaseServiceTest<VehicleTypeServiceImpl, VehicleTypeResponse, CreateVehicleTypeRequest> {

  @Autowired
  public VehicleTypeServiceImplTest(VehicleTypeServiceImpl service) {
    setService(service);
  }

  @Override
  public CreateVehicleTypeRequest createRequest() {
    return new CreateVehicleTypeRequest(new VehicleType("Scooter"));
  }
}
