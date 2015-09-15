/*
 * AnnoyODroid (c) by Jorge Antonio Diaz-Benito Soriano
 *
 * AnnoyODroid is licensed under a Creative Commons Attribution 4.0 International License.
 *
 * You should have received a copy of the license along with this work. If not, see http://creativecommons.org/licenses/by/4.0/.
 */

package annoyodroid;

import annoyodroid.io.network.ApiClient;
import annoyodroid.io.network.IApiService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSuite {

    @Test
    public void dummy() {
        final IApiService service = ApiClient.getApiService("http://www.google.com/");
        Assert.assertNotNull(service);
    }
}