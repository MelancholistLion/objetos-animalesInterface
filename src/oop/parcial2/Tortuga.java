package oop.parcial2;

public class Tortuga extends Animal implements AnimalQueVuela, AnimalQueCamina {
    public String toString() {
        return "Tortuga";
    }

    public void volar() {}

    public void caminar() {}
}
