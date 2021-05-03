package pe.abovo.microservice.multiplication.challenge;

public interface ChallengeService {

    /**
     * Verifies if an attempt coming from the presentation layer is
     * correct or not
     * @param resultAttempt
     * @return
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO
                                   resultAttempt);
}
