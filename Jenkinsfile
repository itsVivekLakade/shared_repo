pipeline {
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
        stage ('Compile') {
            steps {
                bat '${script.WORKSPACE}/mvn compile'
            }
        }
        stage ('Build') {
            steps {
                bat '${script.WORKSPACE}/mvn clean package'
            }
        }
    }
}
