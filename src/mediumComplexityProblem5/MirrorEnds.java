package mediumComplexityProblem5;

public class MirrorEnds {
    public String mirror(String inputString) {
        int strLength = inputString.length();
        String result = "";
        String firstTemp = "";
        String secondTemp = "";
        for (int firstCounter = 0; firstCounter < strLength; firstCounter++) {
            firstTemp = firstTemp + inputString.substring(firstCounter, firstCounter + 1);
            secondTemp = "";
            for (int secondCounter = firstTemp.length() - 1; secondCounter >= 0; secondCounter--) {
                secondTemp = secondTemp + firstTemp.substring(secondCounter, secondCounter + 1);
                if (secondTemp.equals(inputString.substring(strLength - firstCounter - 1, strLength))) {
                    result = firstTemp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MirrorEnds mirrorEnds = new MirrorEnds();
        System.out.println("Mirror ends for 'abXYZba' is :" + mirrorEnds.mirror("abXYZba"));
        System.out.println("Mirror ends for 'abca' is :" + mirrorEnds.mirror("abca"));
        System.out.println("Mirror ends for 'aba' is :" + mirrorEnds.mirror("aba"));
    }
}
