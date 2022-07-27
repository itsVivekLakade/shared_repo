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
                bat 'mvn compile'
            }
        }
        stage ('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}
