package chapter01.initializing_variables;

public class VarInTheRealWorld {

    public static void main(String[] args) {

        PileOfPapersToFileInFilingCabinet pileOfPapersToFile =
                new PileOfPapersToFileInFilingCabinet();

        var pileOfPapersToFileV2 = new PileOfPapersToFileInFilingCabinet();
    }
}
