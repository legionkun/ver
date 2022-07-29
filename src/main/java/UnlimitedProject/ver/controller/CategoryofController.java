package UnlimitedProject.ver.controller;

import UnlimitedProject.ver.DTO.CategoryDTO;
import UnlimitedProject.ver.DTO.ErrorDto;
import UnlimitedProject.ver.Model.Categories;
import UnlimitedProject.ver.service.CategoryInterface;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Validated
@Api(value = "", tags={ "Category" })
@RequestMapping(method = RequestMethod.GET, value = "/category")
public class CategoryofController {
    private final CategoryInterface service;
    //private final ModelMapper map;
    @GetMapping("/categories")
    @ApiOperation(value = "Get list Categories", nickname = "getCategories", notes = "", response = CategoryDTO.class, responseContainer = "List")
    public ResponseEntity<List<CategoryDTO>> GetCategories(){
        List<CategoryDTO> list = service.getListCategories();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping("/categories/{id}")
    @ApiOperation(value = "Get Category by ID", nickname = "getCategory ID", notes = "", response = CategoryDTO.class, responseContainer = "List")
    @ApiResponses(value = {
           @ApiResponse(code = 200, message = "OK", response = CategoryDTO.class, responseContainer = "Object"),
            @ApiResponse(code = 400, message = "Business Error", response = ErrorDto.class, responseContainer = "Object"),
            @ApiResponse(code = 500, message = "Technical Error", response = ErrorDto.class, responseContainer = "Object") })
   public ResponseEntity<Optional<CategoryDTO>> GetId(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) Long id){
        Optional<CategoryDTO> categories = Optional.ofNullable(service.getbyId(id));
        return new ResponseEntity<Optional<CategoryDTO>> (categories, HttpStatus.OK);
    }
}
