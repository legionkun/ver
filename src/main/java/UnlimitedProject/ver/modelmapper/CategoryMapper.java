package UnlimitedProject.ver.modelmapper;

import UnlimitedProject.ver.DTO.CategoryDTO;
import UnlimitedProject.ver.Model.Categories;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CategoryMapper {
    CategoryDTO cateDTO (Categories categories);
}
