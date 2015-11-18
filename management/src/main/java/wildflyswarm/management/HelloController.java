package wildflyswarm.management;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 * @author Yoshimasa Tanabe
 */
@Path("/")
public class HelloController {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String get() {
    return "{\"test\": true}";
  }

}
