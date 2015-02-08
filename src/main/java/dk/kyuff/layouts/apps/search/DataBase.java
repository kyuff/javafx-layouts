package dk.kyuff.layouts.apps.search;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {

    private List<Person> data;

    public DataBase() {
        data = Arrays.asList(
                new Person(11, "Oliver", "Blue", "Action Men"),
                new Person(7, "Vera", "Pink", "Lego Friends"),
                new Person(6, "Dagmar", "Red", "Barbie"),
                new Person(43, "Peter", "Green", "Star Trek"),
                new Person(9, "Mohammed", "Orange", "Lego Ninjago"),
                new Person(6, "Dagny", "Violet", "Barbie Girls"),
                new Person(13, "Josefine", "Black", "Sylvanians"),
                new Person(8, "Johanne", "Grey", "Polly Pocket"),
                new Person(6, "Maria", "Blue", "Frost"),
                new Person(7, "Lise", "Brown", "Frost"),
                new Person(39, "Anders", "Black", "Star Wars"),
                new Person(15, "Kurt", "Purple", "Sylvanians"),
                new Person(8, "Sofia", "Red", "Lego Friends")
        );
    }

    List<Person> search(int age, String name, String color, String dolls) {


        Stream<Person> stream = data.stream();
        if (age > 0) {
            stream = stream.filter(p -> p.getAge() >= age);
        }
        if (name != null && !name.trim().isEmpty()) {
            stream = stream.filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()));
        }
        if (color != null && !color.trim().isEmpty()) {
            stream = stream.filter(p -> p.getColor().toLowerCase().contains(color.toLowerCase()));
        }
        if (dolls != null && !dolls.trim().isEmpty()) {
            stream = stream.filter(p -> p.getDolls().toLowerCase().contains(dolls.toLowerCase()));
        }

        return stream.collect(Collectors.toList());
    }

}
