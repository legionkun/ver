package UnlimitedProject.ver.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public class AbstractAuditing implements Serializable{
    private static final long serialVersionUID = 1L;
    @Column(name = "created_date")
    @JsonIgnore
    private String createdDate;

    @Column(name = "modified_date")
    @JsonIgnore
    private String modifiedDate;
}