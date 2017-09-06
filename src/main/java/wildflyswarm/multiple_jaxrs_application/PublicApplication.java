package wildflyswarm.multiple_jaxrs_application;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/public")
public class PublicApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> resources = new HashSet<>();
    resources.add(PublicResource.class);
    return resources;
  }

}
