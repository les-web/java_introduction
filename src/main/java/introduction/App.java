package introduction;

/*    Boxed primitives
    Parę razy pewnie widziałeś już np. klasę Integer, Long etc.
    Są to tzw . boxed primitives, czyli opakowania (klasy) na typy prymitywne.
    Dlaczego są one potrzebne zostanie wyjaśnione później (np. w kolekcjach).
    Zostały one także użyte w poprzednim zadaniu.
    Wykonaj następujący kod:
 */

    public class App {
        public static void main(String[] args) {
            Integer intValBoxed = 10;
            Long longValBoxed = 10L;
            Short shortValBoxed = 10;
            Double doubleValBoxed = 10.0;
            Float floatValBoxed = 10.0F;
            int var = intValBoxed;
            System.out.println(intValBoxed );
            System.out.println(var );

        }
    }
/*
    Czy zostały zwrócone jakieś błędy?
     Poszukaj w internecie, dlaczego tak się dzieje.
     Słowa kluczowe: java autoboxing.
 */

