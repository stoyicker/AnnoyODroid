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
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import annoyodroid.io.network.ApiClient;
import annoyodroid.io.network.ApiService;

@PrepareForTest(ApiClient.class)
@RunWith(PowerMockRunner.class)
@MediumTest //http://googletesting.blogspot.se/2010/12/test-sizes.html
public class TestSuite {

    @Test
    public void dummy() {
        final ApiService service = ApiClient.getApiService("http://www.google.com/");
        Assert.assertNotNull(service);
    }
}