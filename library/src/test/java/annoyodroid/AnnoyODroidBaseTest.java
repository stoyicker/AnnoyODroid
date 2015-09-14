/*
 * AnnoyODroid (c) by Jorge Antonio Diaz-Benito Soriano
 *
 * AnnoyODroid is licensed under a Creative Commons Attribution 4.0 International License.
 *
 * You should have received a copy of the license along with this work. If not, see http://creativecommons.org/licenses/by/4.0/.
 */

package annoyodroid;

import android.test.suitebuilder.annotation.MediumTest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@MediumTest //http://googletesting.blogspot.se/2010/12/test-sizes.html
public class AnnoyODroidBaseTest {

    @Test
    public void dummyTest() {
        Assert.assertEquals(2 + 2, 4);
    }
}