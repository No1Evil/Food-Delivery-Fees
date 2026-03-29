package global.fujitsu.api.model.weather;

import lombok.NonNull;

/** Weather phenomenon wrapper class. */
public record WeatherPhenomenon(@NonNull String value) {

  public WeatherPhenomenon {
    if (value.isBlank()) {
      throw new IllegalArgumentException("Weather phenomenon value cannot be empty");
    }
    value = value.toLowerCase();
  }
}
