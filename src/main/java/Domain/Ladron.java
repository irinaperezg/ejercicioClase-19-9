package Domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Ladron")
public class Ladron extends Personaje{

    @Column(name="nivelSiniestro")
    private Integer nivelSiniestro;

    @Column(name="tieneNavaja")
    private Boolean tieneNavaja;
}
