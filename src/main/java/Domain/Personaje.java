package Domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class Personaje {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<ElementoDefensor> elementos;

    @Column(name="estamina")
    private Integer estamina;

    @Column(name="puntosDeVida")
    private Integer puntosDeVida;
}
