package mapFlatMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    public Optional<String> getEmail(){
        return Optional.ofNullable(email);
    }
}
