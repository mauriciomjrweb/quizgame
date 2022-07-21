package br.mauriciojr.quizgame.dao;

import java.util.List;
import java.util.Optional;

public interface IDAO<T> {

	void save(T objeto);

	void update(T objeto, String[] params);

	void delete(T objeto);

	Optional<T> findById(long id);

	List<T> findAll();

}
