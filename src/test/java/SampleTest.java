import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by tyguo on 11/29/16.
 */
public class SampleTest {

    @Test
    public void testExample(){
        System.out.println("This is a testing sample for Taiyu");
        assertThat("1+1=2",2,equalTo(1+1));

    }
}

