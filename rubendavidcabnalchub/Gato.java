public class Gato {
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private int estado; 

    public Gato(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.estado = 1;
    }

    public void maullar() {
        if (estado == 3) {
            System.out.println("El gato no puede maullar, porque esta muerto.");
        } else {
            System.out.println("MUA MUA");
        }
    }

    public void huir() {
        if (estado == 3) {
            System.out.println("El gato no puede huir,porque esta muerto.");
        } else if (estado == 0) {
            System.out.println("El gato no puede huir,porque esta durmiendo.");
        } else {
            System.out.println("El gato esta huyendo.");
        }
    }

    public void brincar() {
        if (estado == 3) {
            System.out.println("El gato no puede brincar,porque esta muerto.");
        } else if (estado == 0) {
            System.out.println("El gato no puede brincar,porque esta durmiendo.");
        } else {
            System.out.println("El gato esta brincando.");
        }
    }

    private String obtenerNombreEstado(int estado) {
        switch (estado) {
            case 0:
                return "Durmiendo";
            case 1:
                return "Despierto";
            case 2:
                return "Vivo";
            case 3:
                return "Muerto";
            default:
                return "El gato no existe";
        }
    }
}
