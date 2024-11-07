package example.dsl_style_java.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Metamodel;

@Entity(metamodel = @Metamodel)
public record RecordFuga(String name) {
  public String create() {
    return "create";
  }
}
