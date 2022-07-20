package ir.teherany.entity;

import ir.teherany.entity.Question;
import ir.teherany.entity.Section;
import ir.teherany.entity.embedId.SectionQuestionId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "sectionQuestion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionQuestion {
    @EmbeddedId
    private SectionQuestionId sectionQuestionId;

    @ManyToOne
    @JoinColumn(name = "sectionId", referencedColumnName = "id", insertable = false, updatable = false)
    private Section section;

    @ManyToOne
    @JoinColumn(name = "questionId", referencedColumnName = "id", insertable = false, updatable = false)
    private Question question;
}
