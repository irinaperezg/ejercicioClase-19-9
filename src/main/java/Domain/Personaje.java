package Domain;

import Domain.Converter.ElementoDefensorConverter;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
@Table(name = "personaje")
public class Personaje {
    @Id
    @GeneratedValue
    private Long id;

    @Convert(converter = ElementoDefensorConverter.class)
    @ElementCollection
    @CollectionTable(name = "personaje_elemento_defensor", joinColumns = @JoinColumn(name = "personaje_id"))
    @Column(name = "elemento")
    private List<ElementoDefensor> elementos;

    @Column(name="estamina")
    private Integer estamina;

    @Column(name="puntosDeVida")
    private Integer puntosDeVida;
}
