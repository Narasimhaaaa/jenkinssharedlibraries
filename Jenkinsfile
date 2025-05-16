@Library('shared-lib')

import org.demo.Utils

pipeline {
    agent any

    stages {
        stage('Greet') {
            steps {
                sayHello('DevOps Ninja')  // from vars/
            }
        }

        stage('Use Class') {
            steps {
                script {
                    def utils = new Utils(this)
                    utils.printInfo("This is a shared library class method.")
                }
            }
        }

        stage('Read Template') {
            steps {
                script {
                    def message = libraryResource('messages/welcome.txt')
                    echo message
                }
            }
        }
    }
}
