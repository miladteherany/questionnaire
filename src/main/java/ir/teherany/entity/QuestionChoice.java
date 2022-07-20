package ir.teherany.entity;

import ir.teherany.entity.PermittedResponse;
import ir.teherany.entity.Question;
import ir.teherany.entity.embedId.QuestionChoiceId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "questionChoice")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionChoice {
    @EmbeddedId
    private QuestionChoiceId questionChoiceId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question", referencedColumnName = "id", insertable = false, updatable = false)
    private Question question;

    @ManyToOne
    @JoinColumn(name = "permittedResponse", referencedColumnName = "id", insertable = false, updatable = false)
    private PermittedResponse permittedResponse;
}
