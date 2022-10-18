package oop.parcial2;

public class Pato extends Animal implements AnimalQueNada, AnimalQueVuela, AnimalQueCamina {
    public String toString() {
        return "Pato";
    }

    public void nadar() {}

    public void volar() {}

    public void caminar() {}
}
