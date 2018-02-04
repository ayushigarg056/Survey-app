package com.ayushi.user.surveyapp.util;

/**
 * Created by user on 03-Feb-18.
 */

public class question {
    Long count1,count2,count3,count4;

    public question(Long count1, Long count2, Long count3, Long count4) {
        this.count1 = count1;
        this.count2 = count2;
        this.count3 = count3;
        this.count4 = count4;
    }

    public Long getCount1() {
        return count1;
    }

    public Long getCount2() {
        return count2;
    }

    public Long getCount3() {
        return count3;
    }

    public Long getCount4() {
        return count4;
    }
}


