package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Criando uma stream a partir de uma lista

        List<Person> personList = new Person().populatePerson();

        // Utilizando filter e map para retornar somente o nome das pessoas com nacionalidade Colombia

        Stream<String> filteredMappedPersonList = personList.stream()
                .filter(person -> person.getCitizenship().equals("Colombia"))
                .map(Person::getName);

        // Utilizando filter e sorted para retornar pessoas com nacionalidade Brasil por ordem alfabética

        Stream<Person> filteredSortedPersonList = personList.stream()
                .filter(person -> person.getCitizenship().equals("Brasil"))
                .sorted(Comparator.comparing(Person::getName));

        // Utilizando distinct (que necessita da implementação do equals() e hashCode() na classe)
        // para evitar repetições de novas instâncias

        Stream<Person> distinctPersonList = personList.stream()
                .distinct();

        // Utilizando limit para limitar o tamanho da stream

        Stream<Person> limitedPersonList = personList.stream()
                .limit(2);


        System.out.println("MAP");
        filteredMappedPersonList.forEach(System.out::println);
        System.out.println("DISTINCT");
        distinctPersonList.forEach(System.out::println);
        System.out.println("LIMIT");
        limitedPersonList.forEach(System.out::println);

        boolean isBrasil = filteredSortedPersonList
                .allMatch(person -> person.getCitizenship().equals("Brasil"));

        if(isBrasil)
            System.out.println("BRASILEIRO");
        else
            System.out.println("SEM BRAZILIANS");


        List<Person> filteredCollectionList = personList.stream()
                .filter(person -> person.getName().startsWith("J"))
                .collect(Collectors.toList());

        filteredCollectionList.forEach(person -> System.out.println(person.getName()));

        ArrayList<Person> filteredCollectionArrayList = personList.stream()
                .filter(person -> person.getName().startsWith("O"))
                .collect(Collectors.toCollection(ArrayList::new));

        filteredCollectionArrayList.forEach(System.out::println);

        Map<String, Person> filteredCollectionMap = personList.stream()
                .filter(person -> person.getName().startsWith("J"))
                .collect(Collectors.toMap(Person::getId, Person::new));

        filteredCollectionMap.forEach((key, person) -> System.out.println("Key: " + key + " / " + person));

    }
}
