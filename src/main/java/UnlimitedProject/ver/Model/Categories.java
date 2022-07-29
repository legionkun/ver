package UnlimitedProject.ver.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "categories")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "categoryId")
public class Categories extends AbstractAuditing{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "parent_id")
    private Long parentId;

    @NotNull
    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "rank")
    private Integer rank;

    @Column(name = "is_active")
    private boolean isActive;


    @OneToMany(targetEntity=Categories.class,mappedBy = "parentId",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Categories> categories= new ArrayList<>();


}
