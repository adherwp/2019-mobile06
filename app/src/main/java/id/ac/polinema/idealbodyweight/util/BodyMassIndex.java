package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {

    private int mass;
    private int height;
    private float index;

    public BodyMassIndex(int mass, int height) {
        this.mass = mass;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        return (mass / (height * height));
    }
}
