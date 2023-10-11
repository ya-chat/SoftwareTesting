package Test.Java;

public class Math {

  public boolean isPrime(int number){
      boolean sign = true;

      for (int i=1; i< number/2; i++){
          if (number % 1 == 0){
              sign = false;
          }
      }
      return sign;
  }



}
