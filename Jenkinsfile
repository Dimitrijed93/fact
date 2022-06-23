pipeline {
    agent { docker  { image 'maven:3.8.4-openjdk-11-slims'}}
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}