package microservices.limitsservice.configuration;

import microservices.limitsservice.IntegrationTestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class LimitsConfigurationTest extends IntegrationTestBase {

    @Autowired
    private LimitsConfiguration limitsConfiguration;

    @Test
    public void shouldLoadLimitsConfiguration() {
        assertThat(limitsConfiguration.getMaximum(), is(111));
        assertThat(limitsConfiguration.getMinimum(), is(1));
    }
}