/**
 * @author Tommaso Bagaglia
 */
class Main {
  public static void main(String[] args) {
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
    Matrice m1 = new Matrice ("TPSIT");
    // Creazione di quattro Thread per il popolamento della matrice 
    Vigenere v1 = new Vigenere(0, 12 , 0, 12, m1);
    Vigenere v2 = new Vigenere(0, 12 , 0, 12, m1);
    Vigenere v3 = new Vigenere(0, 12 , 0, 12, m1);
    Vigenere v4 = new Vigenere(0, 12 , 0, 12, m1);
    // Creazione degli oggetti Thread modifica 
    Thread t1 = new Thread(v1);
    Thread t2 = new Thread(v2);
    Thread t3 = new Thread(v3);
    Thread t4 = new Thread(v4);
    // Avvio dei Thread 
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    // Attesa del termine dei Thread
    try {
    t1.join();
    t2.join();
    t3.join();
    t4.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //prima modifica da github
    // Stampa della matrice 
    m1.stampa();
  }
}
