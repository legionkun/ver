package UnlimitedProject.ver.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * SubErrorDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-12T11:17:45.046633500+07:00[Asia/Bangkok]")
public class SubErrorDto {
  @JsonProperty("field")
  private String field;

  @JsonProperty("message")
  private String message;

  public SubErrorDto field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @ApiModelProperty(value = "")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SubErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubErrorDto subErrorDto = (SubErrorDto) o;
    return Objects.equals(this.field, subErrorDto.field) &&
        Objects.equals(this.message, subErrorDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubErrorDto {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

