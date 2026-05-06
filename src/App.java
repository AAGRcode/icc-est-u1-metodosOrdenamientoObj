import models.Person;
import controllers.PersonController;
public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas= {new Person("Juan", 25), new Person("Ana", 19), new Person("Carlos", 30), new Person("Maria", 22), new Person("Diego", 15) };
  
        for(Person person : personas){
            System.out.println(person);
        }
        PersonController.sortPersonByAge(personas);
        System.out.println();
        System.out.println("Ordenado por edad:");
        for(Person person : personas){
            System.out.println(person);
        }

        PersonController.sortPersonByName(personas);
        System.out.println();
        System.out.println("Ordenado por nombre:");
        for(Person person : personas){
            System.out.println(person);
        }
    }
}
