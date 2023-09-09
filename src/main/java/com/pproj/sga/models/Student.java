package com.pproj.sga.models;

import com.pproj.sga.models.dtos.studentdtos.StudentCreateDTO;
import com.pproj.sga.utils.GeneratePin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Date dateOfBirth;
    @Column
    private String studentCode;
    @ManyToOne
    private Genre genre;

    public Student (StudentCreateDTO dto, Genre genre) throws NoSuchAlgorithmException {
        this.name = dto.getName();
        this.surname = dto.getSurname();
        this.dateOfBirth = dto.getDateOfBirth();
        this.studentCode = GeneratePin.generateStringPin();
        this.genre = genre;
    }

}
