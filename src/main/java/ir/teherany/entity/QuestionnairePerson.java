package ir.teherany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "questionnairePerson")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionnairePerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question", referencedColumnName = "id")
    private Questionnaire questionnaire;

    @ManyToOne
    @JoinColumn(name = "person", referencedColumnName = "id")
    private Person person;
}
