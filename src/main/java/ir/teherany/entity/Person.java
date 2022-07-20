package ir.teherany.entity;

import ir.teherany.entity.enumuration.PersonType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "age")
    private Integer age;

    @Column(name = "nationalCode")
    private String nationalCode;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "personType")
    private PersonType personType;
}
