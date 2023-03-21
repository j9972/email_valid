package springMail.verifyOfEmail.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

// 이메일 유효성 검사 -> 중복검사 해줌
// npm install -g maildev ->  http://0.0.0.0:1080/#/ -> 메일을 받아볼 수 있다.
@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //TODO: Regex to validate Email
        return true;
    }
}
