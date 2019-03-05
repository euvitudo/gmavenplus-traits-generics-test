package test


import spock.lang.Specification

class TestImplSpec extends Specification {

    def 'test'() {
        given:
        TestImpl ti = new TestImpl()

        when:
        ti.setValue('test')

        then:
        ti.getValue() == 'test'
    }

}
