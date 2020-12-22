import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataHoraJava8 {
	//Java API de Data e Hora
	public static void main(String[] args) {
		
		//LocalData - Representa uma data: 10/09/2020
		LocalDate ldNow = LocalDate.now();
		System.out.println(ldNow);
		LocalDate ld = LocalDate.of(1993, Month.JUNE, 20);
		System.out.println(ld);
		
		//LocalTime - Representa uma hora em tempo: 22:27:11
		LocalTime ltNow = LocalTime.now();
		System.out.println(ltNow);
		LocalTime.of(11, 11);
		
		//LocalDataTime - Representa uma data + hora: 10/09/2020 22:28:20
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		LocalDateTime.of(1993, Month.JUNE, 20, 11, 11);
		
		//Instant - Representa um momento na linha do tempo (Quantidade de milisegundos contando a partir de 01/01/1970 GMT/UTC)
		Instant instant = Instant.now();
		System.out.println(instant);
		LocalDateTime.of(1993, Month.MAY, 20, 11, 11);
		
		//ZonedDateTime - LocalDateTime com fusu horário
		//ZonedDateTime zdt = ZonedDateTime.now();
		//System.out.println(zdt);
		// zoneId = ZoneId.of("America/Montevideo");
		//ZonedDateTime.of(1993, Month.MAY, 20, 11, 11, 00, 00, Zon);
	}
}