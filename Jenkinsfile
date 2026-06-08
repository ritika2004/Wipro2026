pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK25'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/ritika2004/https://github.com/ritika2004/Wipro2026.git'
            }
        }

        stage('Clean Project') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Execute Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Generate Reports') {
            steps {
                junit '**/surefire-reports/*.xml'
            }
        }

        stage('Archive Screenshots') {
            steps {
                archiveArtifacts artifacts: 'screenshots/*.png',
                fingerprint: true
            }
        }
    }

    post {

        always {
            archiveArtifacts artifacts: 'target/surefire-reports/*.*',
            fingerprint: true
        }

        success {
            echo 'Automation Execution Successful'
        }

        failure {
            echo 'Automation Execution Failed'
        }
    }
}