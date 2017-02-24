package nl.capgemini.areyoutheone.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import nl.capgemini.areyoutheone.domain.Man;

@Component
@Path("/males")
@Produces(MediaType.APPLICATION_JSON)
public class ManEndpoint {
   
   private List<Man> mannen = new ArrayList<>();
   
   @PostConstruct
   public void setUpSomeMales() {
      Man een = new Man();
      een.setId(1);
      een.setName("Mohamed");
      Man twee = new Man();
      twee.setId(2);
      twee.setName("Bernd");
      
      Man drie = new Man();
      drie.setId(3);
      drie.setName("Richard");
      
      this.mannen.addAll(Arrays.asList(een, twee, drie));
   }
   
   @GET
   public Response list() {
      return Response.ok(mannen).build();
   }

}
