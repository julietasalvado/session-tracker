package controllers;

import domain.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import services.SessionService;

import java.util.List;

@RestController
public class SessionController {

  private SessionService service;

  @Autowired
  public void setSessionService(SessionService service) {
    this.service = service;
  }

  @PostMapping("/session")
  public ResponseEntity addSession(@RequestBody Session session) {
    service.addSession(session);
    return ResponseEntity.ok(HttpStatus.OK);
  }

  @GetMapping("/sessions")
  public List getSessions() {
    return service.findAll();
  }
}
