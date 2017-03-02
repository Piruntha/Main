/**
 * Created by Piruntha on 3/2/2017.
 */
public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Person person = new Person();
        person.setName("piruntha");
        person.setEmail("pirunthanavanesan94@gmail.com");
        System.out.println(main.savePerson(person));
    }
    public Person savePerson(Person person){
        if (person == null){
            throw new IllegalArgumentException();

        }else {
            person.setId("p100");
            return person;
        }

    }
}
