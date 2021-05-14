package google.foobar.gearingupfordestruction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GearingUpForDestructionTest {

    @Test
    public void solutionTest() throws Exception {
        int[] inputArray = {4, 17, 50};
        int[] solutionArray = GearingUpForDestruction.solution(inputArray);
        assertEquals(-1, solutionArray[0]);
        assertEquals(-1, solutionArray[1]);

        inputArray = new int[]{1, 51};
        solutionArray = GearingUpForDestruction.solution(inputArray);
        assertEquals(100, solutionArray[0]);
        assertEquals(3, solutionArray[1]);

        inputArray = new int[]{4, 30, 50};
        solutionArray = GearingUpForDestruction.solution(inputArray);
        assertEquals(12, solutionArray[0]);
        assertEquals(1, solutionArray[1]);

        inputArray = new int[]{4, 30, 50, 62, 74};
        solutionArray = GearingUpForDestruction.solution(inputArray);
        assertEquals(12, solutionArray[0]);
        assertEquals(1, solutionArray[1]);

        inputArray = new int[]{4, 30, 50, 62};
        solutionArray = GearingUpForDestruction.solution(inputArray);
        assertEquals(12, solutionArray[0]);
        assertEquals(1, solutionArray[1]);

        inputArray = new int[]{10, 40};
        solutionArray = GearingUpForDestruction.solution(inputArray);
        assertEquals(20, solutionArray[0]);
        assertEquals(1, solutionArray[1]);


    }

}
