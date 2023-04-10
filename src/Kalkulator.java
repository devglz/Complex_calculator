import java.util.Scanner;

public class Kalkulator {

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

        input.close();
    }
}

class Complex {
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

    public String toString() {
        if (im >= 0) {
            return re + " + " + im + "i";
        } else {
            return re + " - " + (-im) + "i";
        }
    }
}