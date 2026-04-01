package io.github.Dfcreis.estudosAPI.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component// Indica que esta classe é um componente gerenciado pelo Spring, permitindo que seja detectada no scan
// e criada automaticamente como um Bean.
public class DateUtil {

    public String formatDateTimeToDateBaseStyle(LocalDateTime dateTime) {

        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(dateTime);

    }


}
