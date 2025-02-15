package com.trainingcenter.tc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
//import org.hibernate.annotations.processing.Pattern;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;
import java.util.List;

@Getter
@Setter
@Entity
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 40)
    @NotNull
    private String centerName;

    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    @NotNull
    private String centerCode;

    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Long createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^[0-9]{10}$")
    @NotNull
    private String contactPhone;
    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

}


