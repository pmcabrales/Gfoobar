package google.foobar.solardoomsday;

import java.util.ArrayList;
import java.util.List;

public class SolarDoomsday {

    public static int[] solution(int area){
        List<Integer> solution = new ArrayList<>();
        int coveredArea = 0;
        int currentArea;

        while (coveredArea < area){
            currentArea = maxCoverableArea(area - coveredArea);
            solution.add(currentArea);
            coveredArea += currentArea;
        }

        return convertIntegers(solution);
    }

    private static int maxCoverableArea(int inputArea){
        double maxSqrt = Math.floor(Math.sqrt(inputArea));
        int maxArea = (int) (maxSqrt * maxSqrt);
        return maxArea;
    }

    private static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

}
