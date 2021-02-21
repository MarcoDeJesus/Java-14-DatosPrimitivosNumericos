import java.nio.charset.Charset;
import java.text.DecimalFormat;

public class Ejercicios {
    public static void main(String ... args){

        // Para asingar un número binario agregamos 0b/0B al inicio.
        byte cincoEnBinario = 0B101;
        // Para convertir de número binario a numeroEnFracciones.
        int cincoEnDecimalDesdeBinario = Integer.parseInt("101", 2);
        // Para convertir de un numeroEnFracciones a un número binario en formato de Cadena.
        String cincoEnBinarioDesdeDecimal = Integer.toBinaryString(5);
        System.out.println("El número con notación BINARIA 0B101 es: " + cincoEnBinario + " en Decimal");
        System.out.println("El número BINARIO 101 se convierte en: " + cincoEnDecimalDesdeBinario + " en Decimal");
        System.out.println("El número 5 se representa como: " + cincoEnBinarioDesdeDecimal + " en BINARIO" );
        System.out.println();

        // Para asignar un número octal agregamos un 0 al inicio.
        int veintidosEnOctal = 026;
        // Para convertir de número octal a numeroEnFracciones.
        int veintidosEnDecimalDesdeOctal = Integer.parseInt("026", 8);
        // Para convertir de un numeroEnFracciones a un número octal en formato de Cadena.
        String veintidosEnOctalDesdeDecimal = Integer.toOctalString(19);
        System.out.println("El número con notación OCTAL 026 es: " + veintidosEnOctal + " en Decimal");
        System.out.println("El número OCTAL 26 se convierte en: " + veintidosEnDecimalDesdeOctal + " en Decimal");
        System.out.println("El número 26 se representa como: " + veintidosEnOctalDesdeDecimal + " en OCTAL" );
        System.out.println();

        // Para convertir de número Hexadecimal a Decimal.
        int treintaEnDecimalDesdeHexadecimal = Integer.parseInt("1e", 16);
        // Para convertir de un numeroEnFracciones a un número hexadecimal en formato de Cadena.
        String treintaEnHexadecimalDesdeDecimal = Integer.toHexString(30);
        System.out.println("El número HEXADECIMAL 1e se convierte en: " + treintaEnDecimalDesdeHexadecimal + " en Decimal");
        System.out.println("El número 30 se representa como: " + treintaEnHexadecimalDesdeDecimal + " en HEXADECIMAL" );
        System.out.println();

        double numeroEnFracciones = 890d / 1500d;
        DecimalFormat formatoDecimalADosDigitos = new DecimalFormat("0.000");
        System.out.println("Número con fracciones sin formato: " + numeroEnFracciones);
        System.out.println("Número con fracciones con formato: " + formatoDecimalADosDigitos.format(numeroEnFracciones));
        System.out.println();

        // Formato de Decimales con 3 dígitos y Separadores de números.
        DecimalFormat formatoDecimal = new DecimalFormat("#,###,##0.000");
        formatoDecimal = new DecimalFormat("#,###,##0.000");
        System.out.println("Separadores por coma con 3 dígitos en fracción: " + formatoDecimal.format(1364565.14));
        System.out.println("Separadores por coma con 3 dígitos en fracción redondeado: " + formatoDecimal.format(1364565.1456));
        System.out.println();

        // Fomato con Notación Científica.
        DecimalFormat notacionCientifica10Ala5 = new DecimalFormat("00.########E0");
        System.out.println("Cantidad en Notación científica con 10^5: " + notacionCientifica10Ala5.format(1234567.89));

        DecimalFormat notacionCientifica10Ala4 = new DecimalFormat("000.000000E0");
        System.out.println("Cantidad en Notación científica con 10^4: " + notacionCientifica10Ala4.format(1234567.89));

        DecimalFormat notacionCientifica10Ala12 = new DecimalFormat("0.0E0");
        System.out.println("Cantidad en Notación científica con 10^12: " + notacionCientifica10Ala12.format(1234567890123.8912));

        DecimalFormat notacionCientifica10AlaMenos2 = new DecimalFormat("00.0E0");
        System.out.println("Cantidad en Notación científica con 10^-2: " + notacionCientifica10AlaMenos2.format(.162));
        System.out.println();

        // Asignación de código Unicode negativo a un char
        // Valor de un char es del 0 (\u0000) al 65,535 (\uffff)
        // (incluyendo al 65,535 entonces hay 65,536 valores disponibles.)
        // https://unicode-table.com/es/#miscellaneous-symbols-and-arrows
        char omDevanagariEnValorHexadecimal = '\u0950';
        char omDevanagariValorDecimal = 2384; // 65536 - 2384
        // Hay que considerar que no hay valores negativos.
        // En realidad cuando pasamos un valor negativo y lo convertimos a char, el valor se vuelve positivo.
        char omDevanagariValorNegativo = (char) -63152;
        System.out.println("El símbolo del Aum/Om (el primer sonido del universo) en Devanagari desde Hexadecimal: " + omDevanagariEnValorHexadecimal);
        System.out.println("El símbolo del Aum/Om (el primer sonido del universo) en Devanagari desde Decimal: " + omDevanagariValorDecimal);
        System.out.println("El símbolo del Aum/Om (el primer sonido del universo) en Devanagari desde 'Negativo': " + omDevanagariValorNegativo);
    }
}
