package classes.basics.homework20200205;


public class TriangleDraw {

  public static void triangleDraw (int n) {
 /*
Trójkąt
Napisać metodę rysującą trójkąt z gwiazdek dla zadanego n. Np, dla n=6

******
*****
****
***
**
*
 */
     for (int i = n; i > 0 ; i--) {        // ilość linijek = od n (podawane jako parametr)  do 1
         for (int j = 1; j <= i ; j++) {   // w linijce musi być tyle znakow * ile wynosi jej numer,
             System.out.print('*');
         }
         System.out.println();

     }
 }
 // end of public static void triangleDraw (int n)


     public static void reverseTriangleDraw (int n) {
      /*
      Trójkąt odwrócony
Napisać metodę rysującą odwrócony trójkat z gwiazdek dla zadanego n, Np: dla n=6:

******
 *****
  ****
   ***
    **
     *
Wskazówka: da się rysować puste znaki: " "
       */

     for (int i = 1; i <= n; i++) {     // draw first line
         System.out.print('*');
     }
     System.out.println();

     for ( int i = n -1; i >=1 ; i--) {           // draw n-1 lines; i shows the number of the line;  numbering starts with n-1
         for (int j = 1; j <= n - i ; j++) {     // draw starting ' ' in the line
             System.out.print(' ');

         }
        for (int k = 1; k <= i ; k++) {
            System.out.print('*');              // draw finishing '*' in the line

        }
         System.out.println();                  // finish the line

     }
     // end of public static void reverseTriangleDraw (int n) {



 }
public static void drawChessBoard2 (int n) {
      /*
      Szachownica
Napisac metodę rysujSzachwnice2, ktora dla zadanej liczby n narysuje szachownicę n * n, np: dla n=4

*#*#
#*#*
*#*#
#*#*
       */

      char white = '*';
      char black = '#';
      boolean isWhite = true;

    for (int i = 1; i <=n ; i++) {          // n lines
        for (int j = 1; j <= n ; j++) {     // n chars in the line
            if (isWhite) {
                System.out.print(white);
                } else {
                System.out.print(black);
                }
            isWhite = !isWhite;

        }
        isWhite = !isWhite;                 // change color for start in the next line
        System.out.println();
    }

  }
// end of public static void drawChessBoard2 (int n)

    public static void drawChessBoardWithFrame (int n) {
      /*
      Szachownica obrysowana ramką
do zadania poprzedniego, szachownicę obrysować ramką (kody ASCII znaków to 205═ 186║, 187╗ 188╝ 200╚ 201╔:

╔════╗
║*#*#║
║#*#*║
║*#*#║
║#*#*║
╚════╝
       */

        char white = '*';
        char black = '#';
        boolean isWhite = true;
        char frameUpperL = ('╔');
        char frameUpperR = ('╗');
        char frameLowerL = ('╚');
        char frameLowerR = ('╝');
        char frameVertical = ('║');
        char frameHorizontal = ('═');

        System.out.print(frameUpperL);
        for (int i = 1; i <=n ; i++) {
            System.out.print(frameHorizontal);
        }
        System.out.print(frameUpperR);
        System.out.println();

        for (int i = 1; i <=n ; i++) {          // n lines
            System.out.print(frameVertical);
            for (int j = 1; j <= n ; j++) {     // n chars in the line
                if (isWhite) {
                    System.out.print(white);
                } else {
                    System.out.print(black);
                }
                isWhite = !isWhite;

            }
            isWhite = !isWhite;                 // change color for start in the next line
            System.out.println(frameVertical);
        }
        System.out.print(frameLowerL);
        for (int i = 1; i <=n ; i++) {
            System.out.print(frameHorizontal);
        }
        System.out.print(frameLowerR);
    }
    // end of public static void drawChessBoardWithFrame (int n)

    }
