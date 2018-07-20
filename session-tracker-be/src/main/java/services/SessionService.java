package services;

import domain.Session;

import java.util.List;

public interface SessionService {
  void addSession(Session session);

  List findAll();
}
