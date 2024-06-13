package tacos.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Taco {

    private String name;
    private List<Ingredient> ingredients;
}
