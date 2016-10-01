package com.maxtech.learningspock

import spock.lang.Issue
import spock.lang.Specification

class SpockLearningSpec extends Specification {

    def 'maximum of two numbers'() {
        expect:
        Math.max(a, b) == c

        where:
        a     | b     || c
        1     | 3     || 3
        10123 | 11123 || 11123
        4444  | 111   || 4444
    }

    @Issue('no amort sched')
    def 'test amort sched'() {
        expect:
        false
    }
}
