package musicshop.repositories;

import musicshop.model.Song;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface SongRepository  extends JpaRepository<Song, Long> {
    @Override
    default <S extends Song> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Song> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default <S extends Song> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default List<Song> findAll() {
        return null;
    }

    @Override
    default List<Song> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    default <S extends Song> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Song> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Song entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default List<Song> findAll(Sort sort) {
        return null;
    }

    @Override
    default <S extends Song, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }


}
