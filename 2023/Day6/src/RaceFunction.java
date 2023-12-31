import java.util.function.Function;
import java.util.stream.LongStream;

public class RaceFunction implements Function<Race, Long> {
    @Override
    public Long apply(Race race) {
        return LongStream.rangeClosed(0, race.getTime())
                .map(x -> (race.getTime() - x) * x)
                .filter(x -> x > race.getDistance())
                .count();
    }
}
