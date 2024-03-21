import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public LocalDate birthDate;
    public LocalDate deathDate;

    public static Person fromCsvLine(String line){
        String[] splited = line.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Person person = new Person();
        person.name = splited[0];
        person.birthDate = LocalDate.parse(splited[1],formatter);
        if (splited[2] != null) {
            person.deathDate = LocalDate.parse(splited[2], formatter);
        }
        return person;
    }


}
