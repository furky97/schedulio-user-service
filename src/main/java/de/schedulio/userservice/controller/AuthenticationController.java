package de.schedulio.userservice.controller;

import de.schedulio.userservice.dto.AuthenticationRequest;
import de.schedulio.userservice.dto.AuthenticationResponse;
import de.schedulio.userservice.dto.RegisterRequest;
import de.schedulio.userservice.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService authenticationService;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
          @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(authenticationService.register(request));
  }

  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
          @RequestBody AuthenticationRequest request
  ) {
    return ResponseEntity.ok(authenticationService.authenticate(request));
  }
}
