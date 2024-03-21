import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        String s = "aa,bb,cc";
//        String[] splited = s.split(",");
//        for (String str : splited) {
//            System.out.println(str);
//        }

//        ArrayList<String> list = new ArrayList<>();
//        list.add("aha");
//        list.add("aha2");
//        for (String str : list) {
//            System.out.println(str);
//        }

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        String dateString = "09.11.2001";
//        LocalDate date = LocalDate.parse(dateString, formatter);

//        try {
//            FileReader fileReader = new FileReader("family.csv");
//            BufferedReader reader = new BufferedReader(fileReader);
//            String line = reader.readLine();
//            while (line != null){
//                line = reader.readLine();
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);

        List<Person> list;
        try {
            list = Person.fromCsv("family.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Person person : list){
            System.out.println(person.name);
    }


    }
}