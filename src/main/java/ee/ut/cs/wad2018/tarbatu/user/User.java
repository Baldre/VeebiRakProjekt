package ee.ut.cs.wad2018.tarbatu.user;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
@Entity
@Getter
@Setter
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userid;
    @Max(50)
    @NotNull
    private String username;
}