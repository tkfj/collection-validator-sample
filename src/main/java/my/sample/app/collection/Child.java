package my.sample.app.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Child implements Serializable {
    private static final long serialVersionUID = -4588208699678321199L;

    @NotBlank
    private String name;
}
