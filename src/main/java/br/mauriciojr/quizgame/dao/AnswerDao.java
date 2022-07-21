package br.mauriciojr.quizgame.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

import br.mauriciojr.quizgame.model.Question;

public class AnswerDao implements IDAO<Question> {

	private final Connection connection;

	public AnswerDao(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void save(Question objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Question objeto, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Question objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Question> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
