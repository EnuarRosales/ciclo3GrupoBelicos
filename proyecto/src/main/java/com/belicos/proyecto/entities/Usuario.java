package com.belicos.proyecto.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
public class Usuario implements Serializable {
    private  static final  long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;

    @OneToMany
    @JoinColumn(name= "id_usuario")
    private List<Rol> roles;


}
