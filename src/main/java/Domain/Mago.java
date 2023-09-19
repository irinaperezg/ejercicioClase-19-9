package Domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mago")
public class Mago extends Personaje{
    @Column(name="nivelDeMagia")
    private Integer nivelDeMagia;

    @Column(name="tieneAlas")
    private Boolean tieneAlas;
}

