class Fraction {
    int denominator;  //Знаменатель
    int numerator;  //Числитель

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    private void shortenFraction() {
        if (numerator >= denominator) {
            for (int i = numerator; i > 0; i--) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator = numerator / i;
                    denominator = denominator / i;
                }
            }
        } else {
            for (int i = denominator; i > 0; i--) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator = numerator / i;
                    denominator = denominator / i;
                }
            }
        }
    }


    private int GDC(int a, int b) { //Наибольший общий делитель

        return b == 0 ? a : GDC(b, a % b);
    }

    private int LCM(int a, int b) { //Наибольшее общее кратное

        return a / GDC(a, b) * b;
    }


    public Fraction add(Fraction frac) {
        int firstNum = this.numerator;
        int firstDen = this.denominator;

        int secondNum = frac.numerator;
        int secondDen = frac.denominator;

        Fraction result = new Fraction(1, 1);

        if (firstDen == secondDen) { //если знаменатели одинаковые
            result.denominator = firstDen;
            result.numerator = firstNum + secondNum;
        } else {
            int LCM = LCM(firstDen, secondDen);
            result.denominator = LCM;
            result.numerator = firstNum * (LCM / firstDen) + secondNum * (LCM / secondDen);
        }
        return result;
    }

    public Fraction sub(Fraction frac) {

        int firstNum = this.numerator;
        int firstDen = this.denominator;

        int secondNum = frac.numerator;
        int secondDen = frac.denominator;

        Fraction result = new Fraction(1, 1);

        if (firstDen == secondDen) { //если знаменатели одинаковые
            result.denominator = firstDen;
            result.numerator = firstNum - secondNum;
        } else {
            int LCM = LCM(firstDen, secondDen);
            result.denominator = LCM;
            result.numerator = firstNum * (LCM / firstDen) - secondNum * (LCM / secondDen);
        }
        return result;

    }


    public Fraction multy(Fraction frac) {

        int firstNum = this.numerator;
        int firstDen = this.denominator;

        int secondNum = frac.numerator;
        int secondDen = frac.denominator;

        Fraction result = new Fraction(1, 1);
        result.denominator = firstDen * secondDen;
        result.numerator = firstNum * secondNum;
        return result;

    }


    public Fraction div(Fraction frac) {
        int firstNum = this.numerator;
        int firstDen = this.denominator;

        int secondNum = frac.numerator;
        int secondDen = frac.denominator;

        Fraction result = new Fraction(1, 1);
        result.denominator = firstDen * secondNum;
        result.numerator = firstNum * secondDen;
        return result;
    }

    public Fraction sub(Fraction f1, Fraction f2) {

        int firstNum = f1.numerator;
        int firstDen = f1.denominator;

        int secondNum = f2.numerator;
        int secondDen = f2.denominator;

        Fraction result = new Fraction(1, 1);

        if (firstDen == secondDen) { //если знаменатели одинаковые
            result.denominator = firstDen;
            result.numerator = firstNum - secondNum;
        } else {
            int LCM = LCM(firstDen, secondDen);
            result.denominator = LCM;
            result.numerator = firstNum * (LCM / firstDen) - secondNum * (LCM / secondDen);
        }
        return result;
    }

    public Fraction add(Fraction f1, Fraction f2) {

        int firstNum = f1.numerator;
        int firstDen = f1.denominator;

        int secondNum = f2.numerator;
        int secondDen = f2.denominator;

        Fraction result = new Fraction(1, 1);

        if (firstDen == secondDen) { //если знаменатели одинаковые
            result.denominator = firstDen;
            result.numerator = firstNum + secondNum;
        } else {
            int LCM = LCM(firstDen, secondDen);
            result.denominator = LCM;
            result.numerator = firstNum * (LCM / firstDen) + secondNum * (LCM / secondDen);
        }
        return result;
    }

    public Fraction multy(Fraction f1, Fraction f2) {

        int firstNum = f1.numerator;
        int firstDen = f1.denominator;

        int secondNum = f2.numerator;
        int secondDen = f2.denominator;

        Fraction result = new Fraction(1, 1);
        result.denominator = firstDen * secondDen;
        result.numerator = firstNum * secondNum;
        return result;

    }

    public Fraction div(Fraction f1, Fraction f2) {

        int firstNum = f1.numerator;
        int firstDen = f1.denominator;

        int secondNum = f2.numerator;
        int secondDen = f2.denominator;

        Fraction result = new Fraction(1, 1);
        result.denominator = firstDen * secondNum;
        result.numerator = firstNum * secondDen;
        return result;

    }


    public String toString() {
        shortenFraction();
        return numerator + "/" + denominator;
    }


}
