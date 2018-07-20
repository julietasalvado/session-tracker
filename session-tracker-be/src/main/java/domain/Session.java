package domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(collection = "session")
public class Session {

  @Id
  private ObjectId _id;

  @NotBlank
  private String name;

  @NotBlank
  private String color;

  public ObjectId getId() {
    return _id;
  }

  public void setId(ObjectId id) {
    this._id = id;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
