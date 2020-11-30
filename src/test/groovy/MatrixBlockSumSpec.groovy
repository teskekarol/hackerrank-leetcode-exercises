import spock.lang.Specification

class MatrixBlockSumSpec extends Specification {

    def solution = new MatrixBlockSum()

    def "should pass first test case"(){
        given:
        int[][] input = [[1,2,3],[4,5,6],[7,8,9]]
        int[][] expectedOutput = [[12,21,16],[27,45,33],[24,39,28]]

        when:
        def result = solution.matrixBlockSum(input, 1)

        then:
        result == expectedOutput
    }

    def "should pass second test case"(){
        given:
        int[][] input = [[1,2,3],[4,5,6],[7,8,9]]
        int[][] expectedOutput = [[45,45,45],[45,45,45],[45,45,45]]

        when:
        def result = solution.matrixBlockSum(input, 2)

        then:
        result == expectedOutput
    }

}
