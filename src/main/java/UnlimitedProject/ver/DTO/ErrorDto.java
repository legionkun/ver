package UnlimitedProject.ver.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * ErrorDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-12T11:17:45.046633500+07:00[Asia/Bangkok]")
public class ErrorDto {
  @JsonProperty("status")
  private Integer status;

  @JsonProperty("timeStamp")
  private String timeStamp;

  @JsonProperty("error")
  private String error;

  @JsonProperty("message")
  private String message;

  @JsonProperty("path")
  private String path;

  @JsonProperty("subError")
  private SubErrorDto subError;

  public ErrorDto status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(example = "400", value = "")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorDto timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
  */
  @ApiModelProperty(example = "2022-05-04 08:57:24", value = "")


  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ErrorDto error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @ApiModelProperty(example = "BAD_REQUEST", value = "")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(example = "Validation error.", value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ErrorDto subError(SubErrorDto subError) {
    this.subError = subError;
    return this;
  }

  /**
   * Get subError
   * @return subError
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubErrorDto getSubError() {
    return subError;
  }

  public void setSubError(SubErrorDto subError) {
    this.subError = subError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.status, errorDto.status) &&
        Objects.equals(this.timeStamp, errorDto.timeStamp) &&
        Objects.equals(this.error, errorDto.error) &&
        Objects.equals(this.message, errorDto.message) &&
        Objects.equals(this.path, errorDto.path) &&
        Objects.equals(this.subError, errorDto.subError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, timeStamp, error, message, path, subError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    subError: ").append(toIndentedString(subError)).append("\n");
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

