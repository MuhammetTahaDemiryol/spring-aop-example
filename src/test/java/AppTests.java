import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.logging.Logger;

import com.tahademiryol.springaopexample.aspects.LoggingAspect;
import com.tahademiryol.springaopexample.aspects.SecurityAspect;
import com.tahademiryol.springaopexample.config.Config;
import com.tahademiryol.springaopexample.model.Car;
import com.tahademiryol.springaopexample.service.CarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { Config.class })
public class AppTests {
    private Logger serviceLogger;
    private Logger loggingAspectLogger;
    private Logger securityAspectLogger;

    @Autowired
    private LoggingAspect loggingAspect;

    @Autowired
    private SecurityAspect securityAspect;

    @Autowired
    private CarService CarService;

    @BeforeEach
    public void before() {
        this.loggingAspectLogger = mock(Logger.class);
        loggingAspect.setLogger(loggingAspectLogger);

        this.securityAspectLogger = mock(Logger.class);
        securityAspect.setLogger(securityAspectLogger);

        this.serviceLogger = mock(Logger.class);
        CarService.setLogger(serviceLogger);
    }

    @Test
    @DisplayName("Test that both aspects intercept the execution" +
        " of the showcaseCar() method.")
    public void testAspectInterceptsShowcaseCarMethod() {
        Car car = new Car();
        car.setName("Test car name");
        car.setModel("Test car model");

        CarService.showcaseCar(car);

        verify(serviceLogger).info("Showcasing car:" + car.getName());
        verify(securityAspectLogger).info("Security Aspect: Calling the intercepted method");
        verify(loggingAspectLogger).info("Logging Aspect: Calling the intercepted method");
    }



}