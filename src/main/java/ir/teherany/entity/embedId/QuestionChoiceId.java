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
public class QuestionChoiceId implements Serializable {
    @Column(name = "questionId")
    private Long questionId;

    @Column(name = "permittedResponseId")
    private Long permittedResponse;
}
