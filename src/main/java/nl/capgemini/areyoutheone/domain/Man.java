package nl.capgemini.areyoutheone.domain;

import java.io.Serializable;

public class Man implements Serializable {
   
   
   private static final long serialVersionUID = 5240059003316761178L;
   
   private long id;
   private String name;
   
   public long getId() {
      return id;
   }
   
   public void setId(long id) {
      this.id = id;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   
}
