/** 
 * Exercice 3 dans le cadre du devoir 1
 * Pour les tests effectués, voir le fichier test.txt
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Classe Permutation qui permet de générer toutes les combinaisons
 * possibles de trois caractères fournis en entrée.
 * Les combinaisons sont affichées sur des lignes séparées.
 * Par exemple, la méthode Permute("a", "b", "c") produira la sortie suivante :
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 * @author theGholem
 * @author ayman-lahdili
 * @version 1.0
    */
public class Permutation{

  private char a; 
  private char b; 
  private char c; //les trois caractères à permuter

  /**
   * Constructeur pour la class Permutation qui initialise les
   * trois caractères à permuter.
   * @param a le premier caractère
   * @param b le deuxième caractère
   * @param c le troisième caractère
   */
  public Permutation(char a, 	char b, char c){
    this.a=a;
    this.b=b;
    this.c=c;
  }

  /**
   * Génère et affiche les différentes permutations des trois caractères
   * Les différentes permutations sont affichées sur des lignes séparées.
   */
  public void Permute(){
    System.out.println( "\nLa permutation est : \n"+this.a+this.b+this.c+
                                                "\n"+this.b+this.c+this.a+
                                                "\n"+this.c+this.a+this.b+
                                                "\n"+this.a+this.c+this.b+
                                                "\n"+this.b+this.a+this.c+
                                                "\n"+this.c+this.b+this.a+
                                                "\n" );
  }

  /**
   * Méthode main qui permet d'instancier la classe Permutation avec
   * des caractères fournis par l'utilisateur et de générer toutes les
   * permutations possibles.
   * @param args
   * @throws Exception si une erreur d'entrée/sortie se produit
   */
  public static void main(String[]args) throws Exception {
    System.out.println("-----> EXO3 \n");
    
    // Lecture des entrées de l'utilisateur
    InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

    System.out.println("Veuiller saisir vos trois lettres: ");
    System.out.print("1: "); 
    char letter1=br.readLine().charAt(0);
    System.out.print("2: "); 
    char letter2=br.readLine().charAt(0);
    System.out.print("3: ");
    char letter3=br.readLine().charAt(0);

    // Génération et affichage des permutations
    Permutation isP=new Permutation(letter1,letter2,letter3);
    isP.Permute();

  }


}
