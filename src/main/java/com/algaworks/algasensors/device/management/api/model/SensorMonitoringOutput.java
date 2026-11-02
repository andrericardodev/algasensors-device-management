package com.algaworks.algasensors.device.management.api.model;

import io.hypersistence.tsid.TSID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorMonitoringOutput {
    private TSID sensorId;
    private Double lastTemperature;
    private OffsetDateTime updateAt;
    private Boolean enabled;
}
