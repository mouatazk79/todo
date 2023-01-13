package klaa.mouataz.simpletodo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true,nullable = false)
    private String name;
    private String description;
    @Column(unique = true,nullable = false)
    private Boolean done;
    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    private Person person;
}
