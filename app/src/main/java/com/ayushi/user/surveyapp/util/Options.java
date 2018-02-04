package com.ayushi.user.surveyapp.util;

/**
 * Created by user on 03-Feb-18.
 */

public class Options {
    Long Count1,Count2,Count3,Count4;

    public Options(Long count1, Long count2, Long count3, Long count4) {
        Count1 = count1;
        Count2 = count2;
        Count3 = count3;
        Count4 = count4;
    }

    public Long getCount1() {
        return Count1;
    }

    public Long getCount2() {
        return Count2;
    }

    public Long getCount3() {
        return Count3;
    }

    public Long getCount4() {
        return Count4;
    }
}
