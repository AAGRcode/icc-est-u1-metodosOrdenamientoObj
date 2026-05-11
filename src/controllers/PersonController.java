package controllers;

import models.Person;

public class PersonController {
    //metodo que ordena un arreglo de personas por su EDAD (age), con metodo insercion
    public static void sortPersonByAge(Person[] personas){
        for(int i=1; i<personas.length; i++){
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getAge() > aux.getAge()){
                personas[j+1]=personas[j];
                j--;
            }
            personas[j+1]=aux;
        }
}
    public static void sortPersonByName(Person[] personas){
        for(int i=1; i<personas.length; i++){
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getName().compareTo(aux.getName()) > 0){
                personas[j+1]=personas[j];
                j--;
            }
            personas[j+1]=aux;
        }
}
    //Metodo orden las personas segun el promedio de sus notas con Seleccion
    public static void sortPersonbyAverageNotas(Person[] personas){
        for(int i=0; i<personas.length; i++){
            int indiceMenor = i;
            for(int j=i+1; j<personas.length; j++){
                //Comparacion para actualizar el indice
                if(personas[j].getPromedio()<personas[indiceMenor].getPromedio()){
                    indiceMenor = j;
                }
                //pregunto si el indiceMenor es != de i, entonces cambio de posiciones
        }
            if(i!=indiceMenor){
                Person aux = personas[i];
                personas[i]=personas[indiceMenor];
                personas[indiceMenor]=aux;
            }

    }
}
    //Ordenar el arreglo de personas por un valor de su nombre, el valor del nombre sera la cantidad de letras donde las vocales valen 5 y las consonantes valen el valor de la edad
    //Ej: Juan 20(edad)             Ej: Ana 80
    // 20+5+5+20=50                 5+80+5=90
    public static void sortPersonByNameValue(Person[] personas){
        for(int i=0; i<personas.length; i++){
            int indiceMenor = i;
            for(int j=i+1; j<personas.length; j++){
                //Comparacion para actualizar el indice
                if(personas[j].NameValue()<personas[indiceMenor].NameValue()){
                    indiceMenor = j;
                }
                //pregunto si el indiceMenor es != de i, entonces cambio de posiciones
        }
            if(i!=indiceMenor){
                Person aux = personas[i];
                personas[i]=personas[indiceMenor];
                personas[indiceMenor]=aux;
            }

    }
    }
}