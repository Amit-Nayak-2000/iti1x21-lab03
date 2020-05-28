public class Rational {

  private int numerator;
  private int denominator;

  // constructors

  public Rational(int numerator) {
    this.numerator = numerator;
    this.denominator = 1;
  }

  public Rational(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
    reduce();
  }

  // getters

  public int getNumerator() {
     return numerator;
  }

  public int getDenominator() {
     return denominator;
  }

  // instance methods

  public Rational plus(Rational other) {
    int finalDenominator = denominator * other.denominator;
    int finalNumerator = (numerator * other.denominator) + (other.numerator * denominator);
    return new Rational(finalNumerator, finalDenominator);
  }

  public static Rational plus(Rational a, Rational b) {
    return a.plus(b);
  }

  // Transforms this number into its reduced form

  private void reduce() {
    int absoluteNumerator = numerator;
    int absoluteDenominator = denominator;
    if(numerator == 0){
      denominator = 1;
    }
    if(numerator < 0){
      absoluteNumerator = numerator * -1;
    }
    if(denominator < 0){
      absoluteDenominator = denominator * -1;
    }
  
    int commonDenominator = gcd(absoluteNumerator, absoluteDenominator);

    if (numerator < 0 && denominator < 0){
      numerator = numerator * -1;
      denominator = denominator * -1;
    }
    numerator /= commonDenominator;
    denominator /= commonDenominator;
    
  }

  // Euclid's algorithm for calculating the greatest common divisor
  private int gcd(int a, int b) {
    // Note that the loop below, as-is, will time out on negative inputs.
    // The gcd should always be a positive number.
    // Add code here to pre-process the inputs so this doesn't happen.

    while (a != b) {
      if (a > b) {
         a = a - b;
      } else {
         b = b - a;
      }
    }
    return a;
  }

  public int compareTo(Rational other) {
    return (numerator * other.denominator) - (other.numerator * denominator);
  }

  public boolean equals(Rational other) {
    if(numerator == other.numerator && denominator == other.denominator){
      return true;
    }
    else{
      return false;
    }
  }

  public String toString() {
    String result;
    if (denominator == 1) {
        result = String.valueOf(numerator);
    } else {
        result = String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }
    return result;
  }
}
