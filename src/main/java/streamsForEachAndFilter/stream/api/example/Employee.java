package streamsForEachAndFilter.stream.api.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    private int id;
    private String name;
    private String dept;
    private long salary;


}
