package demo

class PrinterJob {
    static triggers = {
      simple repeatInterval: 3000l // execute job once in 3 seconds
    }

    def execute() {
        println 'PrinterJob Is Running.'
    }
}
