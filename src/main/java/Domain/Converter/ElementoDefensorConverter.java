package Domain.Converter;

import Domain.Arco;
import Domain.ElementoDefensor;
import Domain.Escudo;
import Domain.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor, String> {
    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
       return elementoDefensor.getClass().getName();
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String elemento) {
        ElementoDefensor elementoDefensor = null;
        if(Objects.equals(elemento, "Escudo"))
            elementoDefensor = new Escudo();
        if(Objects.equals(elemento, "Arco"))
            elementoDefensor = new Arco();
        if(Objects.equals(elemento, "Espada"))
            elementoDefensor = new Espada();

        return elementoDefensor;
    }
}
