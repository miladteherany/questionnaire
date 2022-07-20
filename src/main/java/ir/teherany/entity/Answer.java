package ir.teherany.entity;

import ir.teherany.entity.embedId.AnswerId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "answer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @EmbeddedId
    private AnswerId answerId;

    @ManyToOne
    @JoinColumn(name = "questionChoice", referencedColumnName = "id", insertable = false, updatable = false)
    private QuestionChoice questionChoice;

    @ManyToOne
    @JoinColumn(name = "person", referencedColumnName = "id", insertable = false, updatable = false)
    private Person person;

    @Column(name = "answer")
    private String answer;

    @Column(name = "file")
    private String file;

    @Column(name = "location")
    private String location;
}
