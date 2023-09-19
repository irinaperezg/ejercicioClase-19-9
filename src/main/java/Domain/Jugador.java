package Domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="jugador")
public class Jugador {
    @Id @GeneratedValue
    private Long id;

    @Column(name="apellido")
    private String apellido;

    @Convert(converter = domain.converter.LocalDateAttributeConverter.class)
    @Column(name="fechaAlta")
    private LocalDate fechaAlta;

    @Column(name="nombre")
    private String nombre;

    @Column(name="personaje")
    private Personaje personaje;

    public void cambiarPersonaje(Personaje personaje) {
        //TODO
    }
}
