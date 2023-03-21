package springMail.verifyOfEmail.registration;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Slf4j
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;

}
