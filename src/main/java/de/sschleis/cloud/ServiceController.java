package de.sschleis.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sschleis on 21.02.17.
 */
@RestController
public class ServiceController {

    @Value("${test.value:fallback}")
    private String value;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getMessage()
    {
        return "Propertie is: " + value;
    }
}
