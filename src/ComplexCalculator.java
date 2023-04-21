import java.util.Scanner;

public class ComplexCalculator implements MathConstants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę zespoloną (część rzeczywistą): ");
        double re1 = input.nextDouble();
        System.out.print("Podaj pierwszą liczbę zespoloną (część urojoną): ");
        double im1 = input.nextDouble();
        Complex z1 = new Complex(re1, im1);

        System.out.print("Podaj drugą liczbę zespoloną (część rzeczywistą): ");
        double re2 = input.nextDouble();
        System.out.print("Podaj drugą liczbę zespoloną (część urojoną): ");
        double im2 = input.nextDouble();
        Complex z2 = new Complex(re2, im2);

        System.out.println("Wyniki operacji dla liczb " + z1 + " i " + z2 + ":");

        Complex suma = z1.dodaj(z2);
        System.out.println("Dodawanie: " + suma);

        Complex roznica = z1.odejmij(z2);
        System.out.println("Odejmowanie: " + roznica);

        Complex iloczyn = z1.pomnoz(z2);
        System.out.println("Mnożenie: " + iloczyn);

        Complex iloraz = z1.podziel(z2);
        System.out.println("Dzielenie: " + iloraz);

        System.out.println("Stałe matematyczne:");
        System.out.println("Pi: " + MathConstants.PI);
        System.out.println("Euler: " + MathConstants.E);
        System.out.println("Stała złotego podziału (phi): " + MathConstants.PHI);
        System.out.println("Stała Eulera (gamma): " + MathConstants.GAMMA);
    }
}

interface MathConstants {
    double PI = Math.PI;
    double E = Math.E;
    double PHI = 1.6180339887498948482045868343656; // Stała złotego podziału (phi)
    double GAMMA = 0.5772156649015328606065120900824; // Stała Eulera (gamma)
}

interface ComplexOperations {
    Complex dodaj(Complex z);
    Complex odejmij(Complex z);
    Complex pomnoz(Complex z);
    Complex podziel(Complex z);
}

class Complex implements ComplexOperations {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex dodaj(Complex z) {
        double newRe = this.re + z.re;
        double newIm = this.im + z.im;
        return new Complex(newRe, newIm);
    }

    public Complex odejmij(Complex z) {
        double newRe = this.re - z.re;
        double newIm = this.im - z.im;
        return new Complex(newRe, newIm);
    }

    public Complex pomnoz(Complex z) {
        double newRe = this.re * z.re - this.im * z.im;
        double newIm = this.re * z.im + this.im * z.re;
        return new Complex(newRe, newIm);
    }

    public Complex podziel(Complex z) {
        double denominator = z.re * z.re + z.im * z.im;
        double newRe = (this.re * z.re + this.im * z.im) / denominator;
        double newIm = (this.im * z.re - this.re * z.im) / denominator;
        return new Complex(newRe, newIm);
    }

    @Override
    public String toString() {
        if (im < 0) {
            return re + " - " + (-im) + "i";
        } else {
            return re + " + " + im + "i";
        }
    }
}