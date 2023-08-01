package streams;

import java.util.List;
import java.util.Objects;

public class Person {
    private String id;
    private String name;
    private String citizenship;
    private int age;

    public Person(){}

    public Person(String id, String name, String citizenship, int age) {
        this.id = id;
        this.name = name;
        this.citizenship = citizenship;
        this.age = age;
    }

    public Person(Person person) {
        this.id = person.id;
        this.name = person.name;
        this.citizenship = person.citizenship;
        this.age = person.age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public List populatePerson(){
        Person person1 = new Person("1", "James Rodrigues", "Colombia", 32);
        Person person2 = new Person("2", "Jonathan Calleri", "Argentina", 29);
        Person person3 = new Person("3", "Rogerio Ceni", "Brasil", 52);
        Person person4 = new Person("4", "Aloisio Chulapa", "Brasil", 47);
        Person person5 = new Person("1", "Ronaldo Gaucho", "Brasil", 48);

        return List.of(person1, person2, person3, person4, person5);
    }

}
