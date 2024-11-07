package example.dsl_style_java.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Value;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Metamodel;
import org.seasar.doma.Transient;
import org.seasar.doma.Version;

@Entity(metamodel = @Metamodel, immutable = true)
@Value
@Getter
public class Department {

  public Department(Integer id, String name, Integer version) {
    this.id = id;
    this.name = name;
    this.version = version;

    this.employees = new ArrayList<>();
  }

  @Id Integer id;
  String name;
  @Version Integer version;

  @Transient List<Employee> employees;
}
