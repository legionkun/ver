package UnlimitedProject.ver.service;

import UnlimitedProject.ver.DTO.CategoryDTO;

import java.util.List;

public interface CategoryInterface {
    public List<CategoryDTO> getListCategories();
    public CategoryDTO getbyId(Long id);
}