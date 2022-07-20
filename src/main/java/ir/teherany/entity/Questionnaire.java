package ir.teherany.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "questionnaire")
@Data
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;
}
