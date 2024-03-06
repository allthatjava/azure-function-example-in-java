package brian.example.functions;

import java.util.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Azure Functions with HTTP Trigger.
 */
@Slf4j
public class HttpTriggerJava {
    /**
     * This function listens at endpoint "/api/HttpTriggerJava". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/HttpTriggerJava
     * 2. curl {your host}/api/HttpTriggerJava?name=HTTP%20Query
     */
    @FunctionName("HttpTriggerJava")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.FUNCTION) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) throws Exception {
        context.getLogger().info("Java HTTP trigger processed a request.");

        // Parse query parameter
        String query = request.getQueryParameters().get("name");
        String name = request.getBody().orElse(query);

        if (name == null) {
            throw new Exception("No name parameter was given");

//            log.info("There were no parameter names as name");
//            return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Please pass a name on the query string or in the request body").build();
        } else {
            log.info("The parameter named as name:"+query);
            return request.createResponseBuilder(HttpStatus.OK).body("Hello, " + name).build();
        }
    }
}
