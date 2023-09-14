package com.mateolambis.app;

import com.mateolambis.dominio.Corredor;
import com.mateolambis.dominio.Equipo;
import com.mateolambis.dominio.Etapa;

public class app {
    public static void main(String[] args){
        //crear corredores
        Corredor corredor1 = new Corredor("Mateo", 7, "Hombre", 25);
        Corredor corredor2 = new Corredor("Daniela", 47, "mujer", 20);
        Corredor corredor3 = new Corredor("Harol", 24, "Hombre", 28);
        Corredor corredor4 = new Corredor("Daniel", 98, "Hombre", 18);
        Corredor corredor5 = new Corredor("Camilo", 1, "Hombre", 30);
        Corredor corredor6 = new Corredor("Melissa", 6, "mujer", 15);
        Corredor corredor7 = new Corredor("Raul", 45, "Hombre", 36);
        Corredor corredor8 = new Corredor("Diana", 10, "mujer", 30);
        Corredor corredor9 = new Corredor("Carlos", 87, "Hombre", 20);
        Corredor corredor10 = new Corredor("Juan", 16, "Hombre", 21);
        Corredor corredor11 = new Corredor("Camila", 27, "mujer", 29);
        Corredor corredor12 = new Corredor("Jhoan", 100, "Hombre", 24);
        Corredor corredor13 = new Corredor("Andres", 56, "Hombre", 29);
        Corredor corredor14 = new Corredor("Yesica", 98, "mujer", 22);
        Corredor corredor15 = new Corredor("Lorena", 72, "mujer", 35);
        Corredor corredor16 = new Corredor("Robinson", 33, "Hombre", 24);
        Corredor corredor17 = new Corredor("Esteban", 51, "Hombre", 26);
        Corredor corredor18 = new Corredor("Martin", 44, "Hombre", 25);
        Corredor corredor19 = new Corredor("Leo", 32, "Hombre", 31);
        Corredor corredor20 = new Corredor("Gabriela", 23, "mujer", 21);
        Corredor corredor21 = new Corredor("Felipe", 17, "Hombre", 34);
        Corredor corredor22 = new Corredor("Marcos", 99, "Hombre", 26);
        Corredor corredor23 = new Corredor("Daniel", 95, "Hombre", 32);
        Corredor corredor24 = new Corredor("Jacobo", 77, "Hombre", 27);
        Corredor corredor25 = new Corredor("Luisa", 111, "mujer", 20);

        //Crear equipos y agregar corredores

        //EQUIPO 1
        Equipo equipo1 = new Equipo("Astana", "Alemania");
        equipo1.agregarCorredor(corredor1);
        equipo1.agregarCorredor(corredor2);
        equipo1.agregarCorredor(corredor3);
        equipo1.agregarCorredor(corredor4);
        equipo1.agregarCorredor(corredor5);

        //EQUIPO 2
        /*Equipo equipo2 = new Equipo("Ineos Grenadiers", "Inglaterra");
        equipo2.agregarCorredor(corredor6);
        equipo2.agregarCorredor(corredor7);
        equipo2.agregarCorredor(corredor8);
        equipo2.agregarCorredor(corredor9);
        equipo2.agregarCorredor(corredor10);

        //EQUIPO 3
        Equipo equipo3 = new Equipo("Movistar Team", "Colombia");
        equipo3.agregarCorredor(corredor11);
        equipo3.agregarCorredor(corredor12);
        equipo3.agregarCorredor(corredor13);
        equipo3.agregarCorredor(corredor14);
        equipo3.agregarCorredor(corredor15);

        //EQUIPO 4
        Equipo equipo4 = new Equipo("EF Education First", "Estados Unidos");
        equipo4.agregarCorredor(corredor16);
        equipo4.agregarCorredor(corredor17);
        equipo4.agregarCorredor(corredor18);
        equipo4.agregarCorredor(corredor19);
        equipo4.agregarCorredor(corredor20);

        //EQUIPO 5
        Equipo equipo5 = new Equipo("Deceuninck-Quick Step", "Holanda");
        equipo5.agregarCorredor(corredor21);
        equipo5.agregarCorredor(corredor22);
        equipo5.agregarCorredor(corredor23);
        equipo5.agregarCorredor(corredor24);
        equipo5.agregarCorredor(corredor25);*/

        //CREAR ETAPAS
        Etapa etapa1 = new Etapa(1, "Ciclismo en Ruta");


    }
}
