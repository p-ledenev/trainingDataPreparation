import java.util.*;

/**
 * Created by ledenev.p on 04.08.2015.
 */
public class MaxMinDifferenceTrainingResultStrategy implements ITrainingResultStrategy {

    public TrainingResult computeResult(List<Double> data) {

        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        for (double d : data) {
            max = d > max ? d : max;
            min = d < min ? d : min;
        }

        double k = max / min;

        if (k > 1.5)
            return TrainingResult.buy;

        if (k < 0.5)
            return TrainingResult.sell;

        return TrainingResult.none;
    }
}
