package wildflyswarm.multiple_jaxrs_application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class PublicResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String get() {
    return "This is public resource";
  }

}
