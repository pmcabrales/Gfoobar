package google.foobar.solardoomsday;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SolarDoomsdayTest {

    @Test
    public void solutionTest() throws Exception {
        int[] inputArray = {9,1,1,1};
        int[] solutionArray = SolarDoomsday.solution(12);
        for(int i = 0; i<inputArray.length; i++ ) {
            assertEquals(inputArray[i], solutionArray[i]);
        }

        int[] inputArray2 = {15129,169,25,1};
        int[] solutionArray2 = SolarDoomsday.solution(15324);
        for(int i = 0; i<inputArray.length; i++ ) {
            assertEquals(inputArray[i], solutionArray[i]);
        }
    }

}
