/** 
 * Exercice 1 dans le cadre du devoir 1
 */
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * Class principal
 * @author theGholem
 * @author ayman-lahdili
 */
public class Divisibility{

  private int a, b; // les deux valeurs à comparer

  /**
   * Constructeur pour la class Divisibility
   * @param a
   * @param b
   */
  public Divisibility(int a, int b){
    this.a=a;
    this.b=b;
  }

  /**
   * Vérifie si un le nombre a sont divisbles par b
   * @return boolean
   */
  public boolean isDisvisible() {
    if ( this.a%this.b == 0 ){
      return true;
    } 
    return false;
    
  }


  public static void main(String[]args) {

    System.out.println("-----> EXO1 \n");
    Scanner input = new Scanner(System.in);

    boolean validInput;
    
    do {
      try {
        validInput=true;
        System.out.println("Veuillez saisir le entier nombre svp");
        int n1 = input.nextInt();
        System.out.println("Veuillez saisir le second entier svp");
        int n2 = input.nextInt();

        if ( new Divisibility(n1,n2).isDisvisible() ){
          System.out.println(n1+" est divisible par "+n2+".");
        } else if ( new Divisibility(n2,n1).isDisvisible() ) {
          System.out.println(n1+" n'est pas divisible par "+n2+". \nPar contre, "+n2+" est divisible par "+n1+".");
        } else {
          System.out.println("Aucun des deux nombres n'est divisible");
        }

      } catch (InputMismatchException e) {
        input.next();
        validInput = false;
        System.out.println("Veuiller saisir un nombre entier");
      }
    } while (validInput == false);

    input.close();

  }

}
