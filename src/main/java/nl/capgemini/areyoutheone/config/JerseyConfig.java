package nl.capgemini.areyoutheone.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import nl.capgemini.areyoutheone.rest.ManEndpoint;

@Configuration
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {
   
   public JerseyConfig() {
      register(ManEndpoint.class);
   }
}
