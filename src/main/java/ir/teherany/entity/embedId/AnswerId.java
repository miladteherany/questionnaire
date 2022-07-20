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
public class AnswerId implements Serializable {
    @Column(name = "personId")
    private Long personId;

    @Column(name = "questionChoiceId")
    private Long questionChoiceId;
}
