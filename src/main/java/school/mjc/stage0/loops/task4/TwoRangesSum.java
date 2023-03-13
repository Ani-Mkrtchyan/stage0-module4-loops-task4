package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int skippedSum = 0;
            int countedSum = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (i % numberToSkip == 0) {
                    skippedSum += i;
                    continue;
                }
                countedSum += i;
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is number " + countedSum);
        }
    }

    public static void main(String[] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();
        twoRangesSum.printSumOfTwoRanges(2, 10);
        twoRangesSum.printSumOfTwoRanges(1, -5);
        twoRangesSum.printSumOfTwoRanges(7, 4);
    }
}
