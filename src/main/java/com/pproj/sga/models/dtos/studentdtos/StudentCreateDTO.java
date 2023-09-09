package com.pproj.sga.models.dtos.studentdtos;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;

@Data
public class StudentCreateDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String surname;
    @NotNull
    private Date dateOfBirth;
    @NotBlank
    private String studentCode;

}
