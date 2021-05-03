package pe.abovo.microservice.multiplication.challenge;

/**
 * @return a randomly-generated challenge with factors between 11 and 99
 */
public interface ChallengeGeneratorService {
    Challenge randomChallenge();
}
