package my.sample.app.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionForm implements Serializable {
    private static final long serialVersionUID = 6137687981604895736L;

    @Valid
    private List<Child> list;
}
