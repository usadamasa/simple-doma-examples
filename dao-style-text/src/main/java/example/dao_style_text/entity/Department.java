package example.dao_style_text.entity;

import org.seasar.doma.*;

@Entity(metamodel = @Metamodel)
public class Department {
  @Id Integer id;

  String name;

  @Version Integer version;

  @Transient Employee employees;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }
}
