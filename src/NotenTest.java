import java.util.Arrays;

public class NotenTest {
    public static void nichtAusreichendenNotenTest() {
        Noten test = new Noten();
        int[] test_wahr = {30, 50, 70, 90};
        int[] result_wahr = test.nichtAusreichendenNoten(test_wahr);
        assert Arrays.equals(result_wahr, new int[]{30});
    }
    public static void nichtAusreichendenNotenTest_falsch() {
        Noten test = new Noten();
        int[] test_falsch= {-10, 50, 70, 110};
        int[] result_falsch = test.nichtAusreichendenNoten(test_falsch);
        assert result_falsch == null;
    }

    public static void durchschnittsNoteTest() {
        Noten test = new Noten();
        int[] test_wahr = {30, 50, 70, 90};
        int result_wahr = test.durchschnittsNote(test_wahr);
        assert result_wahr == 60;
    }
    public static void durchschnittsNoteTest_falsch() {
        Noten test = new Noten();
        int[] test_falsch = {-10, 50, 70, 110};
        int result_falsch = test.durchschnittsNote(test_falsch);
        assert result_falsch == -1;
    }

    public static void abgerundeteNoten() {
        Noten test = new Noten();
        int[] test_wahr = {35, 37, 50};
        int[] result_wahr = test.abgerundeteNoten(test_wahr);
        assert Arrays.equals(result_wahr, new int[]{35, 37, 50});
    }
    public static void abgerundeteNoten_falsch() {
        Noten test = new Noten();
        int[] test_falsch = {-10, 50, 70, 110};
        int[] result_falsch = test.abgerundeteNoten(test_falsch);
        assert result_falsch == null;
    }
    public static void maximaleAbgerundeteNoteTest() {
        Noten test = new Noten();
        int[] test_wahr = {30, 50, 70, 90};
        int result_wahr = test.maximaleAbgerundeteNote(test_wahr);
        assert result_wahr == 90;
    }
    public static void maximaleAbgerundeteNoteTest_falsch(){
        Noten test = new Noten();
        int[] test_falsch = {-10, 50, 70, 110};
        int result_falsch = test.maximaleAbgerundeteNote(test_falsch);
        assert result_falsch == -1;
    }
    public static void roudTest(){
        Noten test = new Noten();
        int test1 = 35;
        int result1 = test.round(test1);
        assert result1 == 35;

        int test2 = 40;
        int result2 = test.round(test2);
        assert result2 == 40;

        int test3 = 42;
        int result3 = test.round(test3);
        assert result3 == 42;

        int test4 = 50;
        int result4 = test.round(test4);
        assert result4 == 50;

        int test5 = 53;
        int result5 = test.round(test5);
        assert result5 == 56;

        int test6 = 37;
        int result6 = test.round(test6);
        assert result6 == 37;
    }
}