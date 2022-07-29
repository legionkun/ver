package UnlimitedProject.ver.DTO;

import UnlimitedProject.ver.Model.Categories;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@RequiredArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Category OBJECT")
public class CategoryDTO {
    @JsonProperty("categoryId")
    @ApiModelProperty(notes= "ID of category", name="id",required = true,value = "STUPID BOIZZZZZZ")
    private Long categoryId;

    @JsonProperty("parentId")
    private Long parentId;

    @JsonProperty("categoryName")
    private String categoryName;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("isActive")
    private boolean isActive;

    @JsonProperty("Xcategories")
    private List<Categories> categories= new ArrayList<>();

}
