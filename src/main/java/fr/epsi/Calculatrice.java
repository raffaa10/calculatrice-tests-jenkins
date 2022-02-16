package fr.epsi;

public class Calculatrice {

    /**
     * method addition
     * @param a
     * @param b
     * @return a+b
     */
    public double addition(double a, double b) {
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @return a-b
     */
    public double soustraction(double a, double b) {
        return a -b;
    }

    /**
     *
     * @param a
     * @param b
     * @return a * b
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

    /**
     *
     * @param a
     * @param b
     * @return a / b
     */
    public double division(double a, double b) {
      /*  if(b == 0) {
            throw new ArithmeticException("Division by 0");
        } else {
            return a / b;
        }*/
        return a / b;
    }

}
