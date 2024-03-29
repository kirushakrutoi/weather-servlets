package ru.kirill.WheatherApp.model.dto.location;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MainInfoDto {
    private Double temp;

    @JsonSetter("feels_like")
    private Double feelsLike;

    private int humidity;

    @JsonSetter("temp_min")
    private Double tempMin;

    @JsonSetter("temp_max")
    private Double tempMax;

    private Double pressure;

}
