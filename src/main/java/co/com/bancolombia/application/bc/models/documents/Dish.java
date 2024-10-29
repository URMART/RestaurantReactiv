package co.com.bancolombia.application.bc.models.documents;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dishes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dish {

    private String id;
    private  String name;
    private Double price;
    private Boolean status;

}
