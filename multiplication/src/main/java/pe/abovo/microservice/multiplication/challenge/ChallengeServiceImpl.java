package pe.abovo.microservice.multiplication.challenge;

import org.springframework.stereotype.Service;
import pe.abovo.microservice.multiplication.user.User;

@Service
public class ChallengeServiceImpl implements ChallengeService {

    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {

        boolean isCorrect = attemptDTO.getGuess() ==
                attemptDTO.getFactorA() * attemptDTO.getFactorB();

        User user = new User(null, attemptDTO.getUserAlias());

        return new ChallengeAttempt(
                null,user.getId(), attemptDTO.getFactorA(),
                attemptDTO.getFactorB(),
                attemptDTO.getGuess(),
                isCorrect
        );
    }
}
