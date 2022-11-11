package Classes;

class Complex {
    private int real;
    private int imagine;

    Complex() {
        this(0, 0);
    }

    Complex(int real, int imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public String toString() {
        return real + " + i * " + imagine;
    }
}
