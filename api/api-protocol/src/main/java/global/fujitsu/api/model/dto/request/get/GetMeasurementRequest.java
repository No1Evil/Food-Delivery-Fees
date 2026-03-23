package global.fujitsu.api.model.dto.request.get;

import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;

public record GetMeasurementRequest(@NonNull Long regionId, @Nullable Instant timestamp) {
}
