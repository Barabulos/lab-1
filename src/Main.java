import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        NotenTest.nichtAusreichendenNotenTest();
        NotenTest.nichtAusreichendenNotenTest_falsch();
        NotenTest.durchschnittsNoteTest();
        NotenTest.durchschnittsNoteTest_falsch();
        NotenTest.abgerundeteNoten();
        NotenTest.abgerundeteNoten_falsch();
        NotenTest.maximaleAbgerundeteNoteTest();
        NotenTest.maximaleAbgerundeteNoteTest_falsch();
        NotenTest.roudTest();

        System.out.println("NotenTest erfolgreich abgeschlossen.");

        ZahlenTest.ZahlenminimaleTeste();
        ZahlenTest.ZahlenMaximaleSummeTeste();
        ZahlenTest.ZahlenSummeTeste();
        ZahlenTest.ZahlenminimaleSummeTeste();
        ZahlenTest.ZahlenmaximaleTeste();


        SummeArrayTest.testAddiereZweiZahlen1();
        SummeArrayTest.testAddiereZweiZahlen2();
        SummeArrayTest.testAddiereZweiZahlen3();
        SummeArrayTest.testSubtrahiereZweiZahlen();
        SummeArrayTest.testSubtrahiereZweiZahlen_falsch();
        SummeArrayTest.testMultipliziereMitEinerZiffer();
        SummeArrayTest.testMultipliziereMitEinerZiffer_flasch();
        SummeArrayTest.testDividiereMitEinerZiffer();
        SummeArrayTest.testDividiereMitEinerZiffer_falsch();

        System.out.println("SummeArrayTest erfolgreich abgeschlossen.");

        ElektronikShopTest.billigsteTastaturTest();
        ElektronikShopTest.billigsteTastaturTest_falsch();
        ElektronikShopTest.teuersteGegenstandTest();
        ElektronikShopTest.teuersteGegenstandTest_falsch();
        ElektronikShopTest.teuerstesLeistenTest();
        ElektronikShopTest.teuerstesLeistenTest_falsch();
        ElektronikShopTest.geldBetragTest();
        ElektronikShopTest.geldBetragTest_falsch();

        System.out.println("ElektronikShopTest erfolgreich abgeschlossen.");

    }
}