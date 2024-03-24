package musicshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "songs")
public class Song {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private static final String SEQ_NAME = "song_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NAME")
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String orquesta;
    private String cantor;
    private String album;
    @JoinTable(name = "songs_genres",
    joinColumns = @JoinColumn(name = "song_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;
    private String year;
    private BigDecimal price;
    private Double nds;
    private boolean sales;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

//    @Override
//    public String toString() {
//        return "Music unit {" +
//                "name='" + title + '\'' +
//                ", orquesta='" + orquesta + '\'' +
//                ", cantor='" + cantor + '\'' +
//                ", album='" + album + '\'' +
//                ", genre='" + genres + '\'' +
//                ", year='" + year + '\'' +
//                '}';
//    }
}
