package TestRunner;


import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestRunner {
    @Test
    public void testParallel() {

   Results results = Runner.path("classpath:features").parallel(1);
   assertEquals(results.getErrorMessages(), 0, results.getFailCount());


    }
}