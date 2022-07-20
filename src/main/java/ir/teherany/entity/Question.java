package ir.teherany.entity;

import ir.teherany.entity.enumuration.QuestionType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "question")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "questionType")
    private QuestionType questionType;
}
