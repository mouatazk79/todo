package klaa.mouataz.simpletodo.model;

import jakarta.persistence.*;
import klaa.mouataz.simpletodo.enumerations.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String email;
    private String password;
    @OneToMany(mappedBy="person")
    private Set<Todo> todos;


}
