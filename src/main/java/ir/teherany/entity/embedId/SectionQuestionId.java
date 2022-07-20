package ir.teherany.entity.embedId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionQuestionId implements Serializable {

    @Column(name = "sectionId")
    private Long sectionId;

    @Column(name = "questionId")
    private Long questionId;
}
