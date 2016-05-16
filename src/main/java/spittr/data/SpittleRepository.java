package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by wasika on 2016-05-16.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
