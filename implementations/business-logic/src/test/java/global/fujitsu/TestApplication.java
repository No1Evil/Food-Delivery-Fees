package global.fujitsu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication(scanBasePackages = {"global.fujitsu.persistence", "global.fujitsu.domain"})
@ActiveProfiles("test")
public class TestApplication {

}
