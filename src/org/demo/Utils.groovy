package org.demo

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def printInfo(String msg) {
        steps.echo "INFO: ${msg}"
    }
}
