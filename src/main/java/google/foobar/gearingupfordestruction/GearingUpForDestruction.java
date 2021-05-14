package google.foobar.gearingupfordestruction;

public class GearingUpForDestruction {

    public static int[] solution(int[] pegs){
        int arrayLength = pegs.length;
        boolean isEven = arrayLength % 2 == 0;

        if(arrayLength <= 1){
            return new int[]{-1,-1};
        }
        if(arrayLength == 2){
            return getGearInFractionMode(2 * (pegs[1] - pegs[0]), 3);
        }

        int sum = - pegs[0];
        sum += (isEven)? pegs[arrayLength - 1] : -pegs[arrayLength - 1];

        int sing = 1;
        for (int i = 1; i < arrayLength -1; i++) {
            sum += 2 * (sing * pegs[i]);
            sing *= -1;
        }

        int firstGearRadiusNumerator = 2 * sum;
        int firstGearRadiusDenominator = (isEven)? 3 : 1;
        float firstGearRadius = firstGearRadiusNumerator / firstGearRadiusDenominator;

        if (firstGearRadius < 2) {
            return new int[]{-1,-1};
        }

        float currentRadius = firstGearRadius;
        int centerDistance = 0;
        float nextRadius = 0;
        for (int i = 0; i < arrayLength-2; i++) {
            centerDistance = pegs[i+1] - pegs[i];
            nextRadius = centerDistance - currentRadius;
            if (currentRadius < 1 || nextRadius < 1) {
                return new int[]{-1,-1};
            }else {
                currentRadius = nextRadius;
            }
        }

        return getGearInFractionMode(firstGearRadiusNumerator,firstGearRadiusDenominator);
    }

    private static int[] getGearInFractionMode(float numerator, float denominator) {
        float result = numerator / denominator;
        if(result - Math.floor(result) > 0){
            return new int[]{(int)numerator, (int)denominator};
        }
        return new int[]{(int)result, 1};
    }

}
