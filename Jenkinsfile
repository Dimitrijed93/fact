pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './mvnw clean install'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
