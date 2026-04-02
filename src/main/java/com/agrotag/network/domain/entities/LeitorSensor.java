package com.agrotag.network.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_leitor_sensor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeitorSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_leitura")
    private Long id;

    @Column(name = "umidade", nullable = false)
    @DecimalMin(value = "0.0", message = "Umidade não pode ser negativa")
    @DecimalMax(value = "100.0", message = "Umidade não pode exceder 100%")
    @NotNull(message = "Umidade é obrigatória")
    private Double umidade;

    @Column(name = "temperatura", nullable = false)
    @DecimalMin(value = "-50.0", message = "Temperatura muito baixa")
    @DecimalMax(value = "100.0", message = "Temperatura muito alta")
    @NotNull(message = "Temperatura é obrigatória")
    private Double temperatura;

    @Column(name = "nitrogenio", nullable = false)
    @DecimalMin(value = "0.0", message = "Nitrogênio não pode ser negativo")
    @NotNull(message = "Nitrogênio é obrigatório")
    private Double nitrogenio;

    @Column(name = "fosforo", nullable = false)
    @DecimalMin(value = "0.0", message = "Fósforo não pode ser negativo")
    @NotNull(message = "Fósforo é obrigatório")
    private Double fosforo;

    @Column(name = "potassio", nullable = false)
    @DecimalMin(value = "0.0", message = "Potássio não pode ser negativo")
    @NotNull(message = "Potássio é obrigatório")
    private Double potassio;

    @Column(name = "condutividade_eletrica", nullable = false)
    @DecimalMin(value = "0.0", message = "Condutividade elétrica não pode ser negativa")
    @NotNull(message = "Condutividade elétrica é obrigatória")
    private Double condutividadeEletrica;

    @Column(name = "data_hora_coleta", nullable = false, updatable = false)
    @CreationTimestamp
    @NotNull(message = "Data e hora da coleta é obrigatória")
    private LocalDateTime dataHoraColeta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sensor_id", nullable = false)
    @NotNull(message = "Sensor é obrigatório")
    private Sensor sensor;
}