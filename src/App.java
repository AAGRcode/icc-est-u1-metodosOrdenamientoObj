import models.Person;
import controllers.PersonController;
public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas= {new Person("Juan", 25, new int[]{10, 15,20}), new Person("Ana", 19, new int[]{15, 15,20}), new Person("Carlos", 30, new int[]{10, 10,10}), new Person("Maria", 22, new int[]{20, 15,20}), new Person("Diego", 15, new int[]{20, 10,20}) };
  
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

        PersonController.sortPersonbyAverageNotas(personas);
        System.out.println();   
        System.out.println("Ordenado por promedio de notas:");
        for(Person person : personas){
            System.out.println(person);

        
        }

        PersonController.sortPersonByNameValue(personas);
        System.out.println();   
        System.out.println("Ordenado por valor del nombre:");
        for(Person person : personas){
            System.out.println(person);

        
        }
    }
}
