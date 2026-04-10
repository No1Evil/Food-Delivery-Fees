package global.fujitsu.api.domain.model.vehicle;

import global.fujitsu.api.domain.model.EntityModel;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

/**
 * Provides vehicle type entity.
 *
 * @param id entity id
 * @param type vehicle type
 */
public record VehicleTypeEntity(
    @Nullable Long id,
    @NonNull VehicleType type
) implements EntityModel {

}
