package ir.teherany.entity;

import ir.teherany.entity.Questionnaire;
import ir.teherany.entity.Section;
import ir.teherany.entity.embedId.QuestionnaireSectionId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "questionnaireSection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionnaireSection {

    @EmbeddedId
    private QuestionnaireSectionId questionnaireSectionId;

    @ManyToOne
    @JoinColumn(name = "questionnaireId", referencedColumnName = "id", insertable = false, updatable = false)
    private Questionnaire questionnaire;

    @ManyToOne
    @JoinColumn(name = "sectionId", referencedColumnName = "id", insertable = false, updatable = false)
    private Section section;
}
