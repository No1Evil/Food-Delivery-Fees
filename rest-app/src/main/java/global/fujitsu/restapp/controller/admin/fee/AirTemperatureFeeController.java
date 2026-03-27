package global.fujitsu.restapp.controller.admin.fee;

import global.fujitsu.api.domain.service.fee.AirTemperatureFeeService;
import global.fujitsu.api.model.dto.request.create.CreateAirTemperatureFeeRequest;
import global.fujitsu.api.model.dto.request.get.GetAirTemperatureFeeRequest;
import global.fujitsu.api.model.dto.response.get.AirTemperatureFeeResponse;
import global.fujitsu.api.model.fee.FeeResult;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Provides API for air temperatures fees. */
@RestController
@RequestMapping(value = "/api/admin/fee/air-temperatures", headers = "X-API-VERSION=1")
@RequiredArgsConstructor
public final class AirTemperatureFeeController {

  private final AirTemperatureFeeService service;

  /** {@return base fee} */
  @PostMapping("/base-fee")
  public ResponseEntity<FeeResult> getBaseFee(@RequestBody GetAirTemperatureFeeRequest req) {
    return ResponseEntity.ok(service.getBaseFee(req));
  }

  /** {@return created air temperature fee id} */
  @PostMapping
  public ResponseEntity<Long> create(
      @RequestBody CreateAirTemperatureFeeRequest req) {
    return ResponseEntity.ok(service.create(req));
  }

  /** {@return found air temperature fee} */
  @GetMapping("/{id}")
  public ResponseEntity<AirTemperatureFeeResponse> findById(
      @PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id));
  }

  /** {@return if fee is deleted} */
  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> deleteById(
      @PathVariable Long id) {
    return ResponseEntity.ok(service.delete(id));
  }

  /** {@return found air temperature fee list} */
  @GetMapping("/all")
  public ResponseEntity<List<AirTemperatureFeeResponse>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
