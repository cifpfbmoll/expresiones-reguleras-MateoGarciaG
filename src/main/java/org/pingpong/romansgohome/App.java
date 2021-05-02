package org.pingpong.romansgohome;

import org.pingpong.romansgohome.domain.TranslatorRomanNumbers;

//import static org.assertj.core.api.Assertions.assertThat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String test = "MMMDCCCLXXXVIII"; // 3888
        //test = "MMDCCLXXVII";  // 2777
        //test = "CDXLIV"; // 444
        test = "CDXXXIX"; // 439

        TranslatorRomanNumbers romanNumber = new TranslatorRomanNumbers(test);
        //romanNumber.initRegexDictionary();
        romanNumber.addRegex("grupoSumatorio", "((?<!C)[DM]|(?<!X)[LC](?![DM]))|((?<!I)[VX](?![LC])|I(?![VX]))");
        // Para verlo de una mejor forma:
        // ( (?<!C)[DM] | (?<!X)[LC](?![DM]) ) | ( (?<!I)[VX](?![LC]) | I(?![VX]) )
        romanNumber.addRegex("grupoSustractivo", "(C[DM])|(X[LC])|(I[VX])");
        //romanNumber.initRegexDictionary();
        //assertThat(romanNumber.toDecimal()).isEqualTo((short) 439);
        System.out.printf("El número romano: %s = %d", romanNumber.getRomanNumber(), romanNumber.toDecimal());
        // La linea siguiente dará error debido a que ya previamente habiamos llamado al método toDecimal()
        //System.out.println((romanNumber.toDecimal() != 0) ? romanNumber.getRomanNumber() + " = " +  romanNumber.toDecimal() : "The roman number is incorrect");

    }
}
