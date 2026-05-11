package models;

public class Person {
    private String name;
    private int age;
    private int[] notas;

    public Person() {
    }

    public Person(String name, int age, int[] notas) {
        this.name = name;
        this.age = age;
        this.notas = notas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getPromedio(){
        int suma = 0;
        for(int nota : notas){
            suma += nota;
        }
        return suma/notas.length;
    }

    public int NameValue(){
        int total=0;
        for(int i=0; i<name.length(); i++){
            char letra = name.toLowerCase().charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                total += 5;
            } else {
                total += age;
            }
        }
        return total;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", promedio=" + getPromedio() + ", nameValue=" + NameValue() + "]";
    }
    
}
