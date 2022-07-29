package UnlimitedProject.ver.service.impl;

import UnlimitedProject.ver.DTO.CategoryDTO;
import UnlimitedProject.ver.modelmapper.CategoryMapper;
import UnlimitedProject.ver.repository.CategoryRepo;
import UnlimitedProject.ver.service.CategoryInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class CategoryService implements CategoryInterface {
    private  final CategoryRepo cateRepo;
    private final CategoryMapper categoryMapper;
    @Override
    public List<CategoryDTO> getListCategories() {
        try {
                return cateRepo.findAll().stream().
                        map(categoryMapper::cateDTO).collect(Collectors.toList());
        }catch(IllegalArgumentException exception){
            log.debug(exception.getMessage());
            return cateRepo.findAll().stream().
                    map(categoryMapper::cateDTO).collect(Collectors.toList());
        }
    }

    @Override
    public CategoryDTO getbyId(Long id) {
        return categoryMapper.cateDTO(cateRepo.findById(id).get());
    }
}
