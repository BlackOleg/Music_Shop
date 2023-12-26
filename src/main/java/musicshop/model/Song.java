package musicshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "song" ,schema = "musicshop")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String orquesta;
    @Column(nullable = false, name = "cantor")
    private String cantor;
    private String album;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String year;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
