package kz.bitlab.finalproject.trello.repos;

import kz.bitlab.finalproject.trello.classes.Coms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComRepos extends JpaRepository<Coms,Long> {
    Coms findAllById(Long id);
}
