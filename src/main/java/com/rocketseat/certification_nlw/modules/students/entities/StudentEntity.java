package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       // Cria todos os getters e setters
@AllArgsConstructor     // Cria um construtor com todos os parâmetros
@NoArgsConstructor      // Cria um construtor vazio
public class StudentEntity {

    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntity;

}
