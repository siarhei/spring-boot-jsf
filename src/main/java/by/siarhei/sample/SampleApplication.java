package by.siarhei.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SampleApplication.class);

    public static void main(String[] args) {
        LOG.debug("Starting Sample Application");
        SpringApplication.run(SampleApplication.class, args);
    }

}
