package nttdata.studentjpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Student {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String direction;
    private String state;
}
