package com.agrotag.network.domain.entities;

import com.agrotag.network.domain.entities.enums.TipoUsuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true)
    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max = 100, message = "Nome deve ter entre 3 e 100 caracteres")
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    @Email(message = "Email deve ser válido")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    @Column(name = "senha", nullable = false)
    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    private String senha;

    @Column(name = "ativo", nullable = false)
    private boolean ativo = true;

    @Column(name = "data_registro", nullable = false)
    private LocalDateTime dataDeRegistro = LocalDateTime.now();

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "tipo_usuario", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

}
