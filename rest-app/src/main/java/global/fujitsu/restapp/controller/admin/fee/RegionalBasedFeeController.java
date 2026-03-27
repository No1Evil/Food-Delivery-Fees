package global.fujitsu.restapp.controller.admin.fee;

import global.fujitsu.api.domain.service.fee.RegionalBasedFeeService;
import global.fujitsu.api.model.dto.request.create.CreateRegionalBasedFeeRequest;
import global.fujitsu.api.model.dto.request.get.GetRegionalBasedFeeRequest;
import global.fujitsu.api.model.dto.response.get.RegionalBasedFeeResponse;
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

/** Provides API for regional based fees. */
@RestController
@RequestMapping(value = "/api/admin/fee/regional-based", headers = "X-API-VERSION=1")
@RequiredArgsConstructor
public final class RegionalBasedFeeController {

  private final RegionalBasedFeeService service;

  /** {@return base fee} */
  @PostMapping("/base-fee")
  public ResponseEntity<FeeResult> getBaseFee(@RequestBody GetRegionalBasedFeeRequest req) {
    return ResponseEntity.ok(service.getBaseFee(req));
  }

  /** {@return created regional based fee id} */
  @PostMapping
  public ResponseEntity<Long> create(
      @RequestBody CreateRegionalBasedFeeRequest req) {
    return ResponseEntity.ok(service.create(req));
  }

  /** {@return found regional based fee} */
  @GetMapping("/{id}")
  public ResponseEntity<RegionalBasedFeeResponse> findById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id));
  }

  /** {@return if fee is deleted} */
  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> deleteById(@PathVariable Long id) {
    return ResponseEntity.ok(service.delete(id));
  }

  /** {@return found fee list} */
  @GetMapping("/all")
  public ResponseEntity<List<RegionalBasedFeeResponse>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
