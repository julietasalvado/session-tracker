package services;

import domain.Session;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repositories.SessionRepository;

import java.util.stream.Stream;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SessionServiceImplTest {

  @InjectMocks
  private SessionServiceImpl service;

  @Mock
  private SessionRepository repository;

  @ParameterizedTest
  @MethodSource("addSessionsProvider")
  void addSession(Session session) {
    // when
    service.addSession(session);

    // then
    verify(repository).save(session);
  }

  private static Stream addSessionsProvider() {
    return Stream.of(
            null,
            new Session(),
            getSession()
    );
  }

  private static Session getSession() {
    Session session = new Session();
    session.setName("name");
    session.setColor("color");

    return session;
  }
}