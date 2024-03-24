package musicshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "genres")
public class Genre {

    private static final String SEQ_NAME = "genre_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NAME")
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME)
    private Long id;
    private String title;
}
