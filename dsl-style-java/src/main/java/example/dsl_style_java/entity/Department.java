package example.dsl_style_java.entity;

import java.util.ArrayList;
import java.util.List;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Metamodel;
import org.seasar.doma.Transient;
import org.seasar.doma.Version;

@Entity(metamodel = @Metamodel)
public record Department(
    @Id Integer id, String name, @Version Integer version, @Transient List<Employee> employees) {

  public Department(Integer id, String name, Integer version) {
    this(id, name, version, new ArrayList<>());
  }
}
