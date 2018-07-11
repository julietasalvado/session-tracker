package services;

import domain.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.SessionRepository;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

  private SessionRepository repository;

  @Autowired
  public SessionServiceImpl(SessionRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addSession(Session session) {
    repository.save(session);
  }

  @Override
  public List findAll() {
    return repository.findAll();
  }
}
