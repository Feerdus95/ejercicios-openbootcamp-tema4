public class Main {
    public static void main(String[] args) {
        /*Inicio ejercicio IF*/
        int numeroIf = 0; /*Valor asignado a numeroIf*/

        if(numeroIf > 0){
            System.out.println("El númeroIf " +numeroIf+ " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El númeroIf " +numeroIf+ " es negativo");
        } else {
            System.out.println("El númeroIf es 0");
        }
        /*Fin ejercicio IF*/
        /*Inicio ejercicio WHILE*/
        int numeroWhile = 0; /*Valor asignado a numeroWhile*/

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("El numeroWhile es: " +numeroWhile);
        }
        /*Fin ejercicio WHILE*/
        /*Inicio ejercicio DO WHILE*/
        int numeroDoWhile = 3; /*Valor asignado a numeroDoWhile*/

        do {
            numeroDoWhile++;
            System.out.println("El numeroDoWhile es: " +numeroDoWhile);
        } while (numeroDoWhile < 3);
        /*Fin ejercicio DO WHILE*/
        /*Inicio ejercicio FOR*/

        for (int numeroFor = 0;numeroFor <= 3; numeroFor++){
            System.out.print("\nEl numeroFor es: "+numeroFor);
        }
        /*Fin ejercicio FOR*/
        /*Inicio ejercicio SWITCH*/
        var estacion = "PEPITO"; /*Variable Estaciones*/

        switch(estacion){
            case "VERANO":
                System.out.print("\nEs verano");
                break;
            case "OTOÑO":
                System.out.print("\nEs otoño");
                break;
            case "INVIERNO":
                System.out.print("\nEs invierno");
                break;
            case "PRIMAVERA":
                System.out.print("\nEs primavera");
                break;
            default:
                System.out.print("\nLa variable no contiene una estación");
        }
        /*Fin ejercicio SWITCH*/
    }
}