package ir.teherany.entity;

import javax.persistence.*;

@Entity
@Table(name = "permittedResponse")
public class PermittedResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "valueChoice")
    private Integer valueChoice;

    @Column(name = "title")
    private String title;
}
