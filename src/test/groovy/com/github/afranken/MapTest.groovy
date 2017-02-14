package groovy.com.github.afranken

import spock.lang.Specification

class MapTest extends Specification {

    def "map values are returned correctly"() {
        given: "a new map instance"
        Map<String, String> cache = [:]

        when: "a test value is added"
        cache.put("test", "testValue")

        then: "the map value can be returned"
        cache.get("test") == "testValue"

    }

    def "empty map value is null"() {
        given: "a new map instance"
        Map<String, String> cache = [:]

        when: "a test value is added with the wrong key"
        cache.put("test", "testValue")

        then: "the map value can be returned"
        cache.get("notPresent") == null

    }

}
