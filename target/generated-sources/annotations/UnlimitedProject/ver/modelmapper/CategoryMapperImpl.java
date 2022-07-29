package UnlimitedProject.ver.modelmapper;

import UnlimitedProject.ver.DTO.CategoryDTO;
import UnlimitedProject.ver.Model.Categories;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-27T16:11:43+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO cateDTO(Categories categories) {
        if ( categories == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setCategoryId( categories.getCategoryId() );
        categoryDTO.setParentId( categories.getParentId() );
        categoryDTO.setCategoryName( categories.getCategoryName() );
        categoryDTO.setRank( categories.getRank() );
        categoryDTO.setActive( categories.isActive() );
        List<Categories> list = categories.getCategories();
        if ( list != null ) {
            categoryDTO.setCategories( new ArrayList<Categories>( list ) );
        }

        return categoryDTO;
    }
}
