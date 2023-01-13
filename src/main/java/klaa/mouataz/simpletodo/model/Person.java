package klaa.mouataz.simpletodo.model;

import jakarta.persistence.*;
import klaa.mouataz.simpletodo.enumerations.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(unique = true,nullable = false)
    private Gender gender;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true,nullable = false)
    private String password;
    @OneToMany(mappedBy="person")
    private Set<Todo> todos;

    public Person(Long id, String firstName, String lastName, Gender gender, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }
}
